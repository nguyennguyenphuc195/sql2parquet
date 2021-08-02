package com.converter;

// Generic Avro dependencies
import org.apache.avro.Schema;

// Hadoop stuff
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.specific.SpecificData;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;

// Generic Parquet dependencies
import org.apache.parquet.hadoop.ParquetInputFormat;
import org.apache.parquet.hadoop.ParquetReader;
import org.apache.parquet.hadoop.api.WriteSupport;
import org.apache.parquet.hadoop.util.HadoopOutputFile;
import org.apache.parquet.io.OutputFile;
import org.apache.parquet.io.PositionOutputStream;
import org.apache.parquet.schema.MessageType;
import org.apache.parquet.hadoop.metadata.CompressionCodecName;
import org.apache.parquet.hadoop.ParquetWriter;
// Avro->Parquet dependencies
import org.apache.parquet.avro.AvroSchemaConverter;
import org.apache.parquet.avro.AvroParquetWriter;
import org.apache.parquet.avro.AvroParquetReader;


import org.apache.parquet.hadoop.api.ReadSupport;
import org.apache.parquet.example.data.Group;
import org.apache.parquet.hadoop.example.GroupReadSupport;
import org.apache.parquet.filter2.compat.FilterCompat;

import java.io.IOException;
import java.sql.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Locale;

import static org.apache.parquet.filter2.predicate.FilterApi.*;

public class Main {
    public static void main(String[] args) {
        Schema writeAvroSchema = WriteUserSchema.getClassSchema();

        Schema readAvroSchema = ReadUserSchema.getClassSchema();
        MessageType readSchema = new AvroSchemaConverter().convert(readAvroSchema);

        Path outputPath = new Path("./user.parquet");
        int blockSize = 1024;
        int pageSize  = 65535;

        convert(outputPath, writeAvroSchema, blockSize, pageSize);
    }

    private static void write(WriteUserSchema[] data, Path path, Schema schema, int blockSize, int pageSize) {
        try (ParquetWriter parquetWriter = new AvroParquetWriter(path, schema, CompressionCodecName.SNAPPY, blockSize, pageSize)) {
            for (WriteUserSchema u : data) {
                parquetWriter.write(u);
            }
        }
        catch (java.io.IOException e) {
            System.out.println(String.format("Error writing parquet file %s", e.getMessage()));
            e.printStackTrace();
        }
    }

    private static void read(Path path, MessageType schema) {
        Configuration configuration = new Configuration();
        configuration.set(ReadSupport.PARQUET_READ_SCHEMA, schema.toString());

        // read
        try {
            ParquetReader<Group> reader= ParquetReader
                    .builder(new GroupReadSupport(), path)
                    .withConf(configuration)
                    .build();

            Group line;
            while ((line = reader.read()) != null) {
                System.out.println(line.toString());
                break;
            }
        }
        catch (java.io.IOException e) {
            System.out.println(String.format("Error reading parquet file %s", e.getMessage()));
            e.printStackTrace();
        }
    }

    private static void convert(Path path, Schema schema, int blockSize, int pageSize) {
        try (ParquetWriter parquetWriter = new AvroParquetWriter(path, schema, CompressionCodecName.SNAPPY, blockSize, pageSize)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","user","Password123");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from MOCK_DATA");
            while(rs.next()) {
                int    id    = rs.getInt(1);
                String first_name = rs.getString(2);
                String last_name  = rs.getString(3);
                String email      =  rs.getString(4);
                long   buy_date   = Helper.dateToUnixDay(rs.getDate(5));
                float  points     = rs.getFloat(6);
                WriteUserSchema u = new WriteUserSchema(
                        id,
                        first_name,
                        last_name,
                        email,
                        buy_date,
                        points);
                parquetWriter.write(u);
            }

            con.close();
        }
        catch (java.io.IOException | java.sql.SQLException | java.lang.ClassNotFoundException e) {
            System.out.println(String.format("Error writing parquet file %s", e.getMessage()));
            e.printStackTrace();
        }
    }
}
