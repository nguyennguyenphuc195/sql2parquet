/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.converter;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class WriteUserSchema extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8850376337360812738L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WriteUserSchema\",\"namespace\":\"com.converter\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"age\",\"type\":[\"int\",\"null\"]},{\"name\":\"point\",\"type\":[\"float\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<WriteUserSchema> ENCODER =
      new BinaryMessageEncoder<WriteUserSchema>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<WriteUserSchema> DECODER =
      new BinaryMessageDecoder<WriteUserSchema>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<WriteUserSchema> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<WriteUserSchema> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<WriteUserSchema> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<WriteUserSchema>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this WriteUserSchema to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a WriteUserSchema from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a WriteUserSchema instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static WriteUserSchema fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private int id;
   private java.lang.CharSequence name;
   private java.lang.Integer age;
   private java.lang.Float point;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public WriteUserSchema() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param name The new value for name
   * @param age The new value for age
   * @param point The new value for point
   */
  public WriteUserSchema(java.lang.Integer id, java.lang.CharSequence name, java.lang.Integer age, java.lang.Float point) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.point = point;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return age;
    case 3: return point;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: age = (java.lang.Integer)value$; break;
    case 3: point = (java.lang.Float)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public int getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(int value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return The value of the 'age' field.
   */
  public java.lang.Integer getAge() {
    return age;
  }


  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'point' field.
   * @return The value of the 'point' field.
   */
  public java.lang.Float getPoint() {
    return point;
  }


  /**
   * Sets the value of the 'point' field.
   * @param value the value to set.
   */
  public void setPoint(java.lang.Float value) {
    this.point = value;
  }

  /**
   * Creates a new WriteUserSchema RecordBuilder.
   * @return A new WriteUserSchema RecordBuilder
   */
  public static com.converter.WriteUserSchema.Builder newBuilder() {
    return new com.converter.WriteUserSchema.Builder();
  }

  /**
   * Creates a new WriteUserSchema RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new WriteUserSchema RecordBuilder
   */
  public static com.converter.WriteUserSchema.Builder newBuilder(com.converter.WriteUserSchema.Builder other) {
    if (other == null) {
      return new com.converter.WriteUserSchema.Builder();
    } else {
      return new com.converter.WriteUserSchema.Builder(other);
    }
  }

  /**
   * Creates a new WriteUserSchema RecordBuilder by copying an existing WriteUserSchema instance.
   * @param other The existing instance to copy.
   * @return A new WriteUserSchema RecordBuilder
   */
  public static com.converter.WriteUserSchema.Builder newBuilder(com.converter.WriteUserSchema other) {
    if (other == null) {
      return new com.converter.WriteUserSchema.Builder();
    } else {
      return new com.converter.WriteUserSchema.Builder(other);
    }
  }

  /**
   * RecordBuilder for WriteUserSchema instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<WriteUserSchema>
    implements org.apache.avro.data.RecordBuilder<WriteUserSchema> {

    private int id;
    private java.lang.CharSequence name;
    private java.lang.Integer age;
    private java.lang.Float point;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.converter.WriteUserSchema.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.point)) {
        this.point = data().deepCopy(fields()[3].schema(), other.point);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing WriteUserSchema instance
     * @param other The existing instance to copy.
     */
    private Builder(com.converter.WriteUserSchema other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.point)) {
        this.point = data().deepCopy(fields()[3].schema(), other.point);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public int getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.converter.WriteUserSchema.Builder setId(int value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.converter.WriteUserSchema.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.converter.WriteUserSchema.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.converter.WriteUserSchema.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * @return The value.
      */
    public java.lang.Integer getAge() {
      return age;
    }


    /**
      * Sets the value of the 'age' field.
      * @param value The value of 'age'.
      * @return This builder.
      */
    public com.converter.WriteUserSchema.Builder setAge(java.lang.Integer value) {
      validate(fields()[2], value);
      this.age = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'age' field.
      * @return This builder.
      */
    public com.converter.WriteUserSchema.Builder clearAge() {
      age = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'point' field.
      * @return The value.
      */
    public java.lang.Float getPoint() {
      return point;
    }


    /**
      * Sets the value of the 'point' field.
      * @param value The value of 'point'.
      * @return This builder.
      */
    public com.converter.WriteUserSchema.Builder setPoint(java.lang.Float value) {
      validate(fields()[3], value);
      this.point = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'point' field has been set.
      * @return True if the 'point' field has been set, false otherwise.
      */
    public boolean hasPoint() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'point' field.
      * @return This builder.
      */
    public com.converter.WriteUserSchema.Builder clearPoint() {
      point = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public WriteUserSchema build() {
      try {
        WriteUserSchema record = new WriteUserSchema();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.age = fieldSetFlags()[2] ? this.age : (java.lang.Integer) defaultValue(fields()[2]);
        record.point = fieldSetFlags()[3] ? this.point : (java.lang.Float) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<WriteUserSchema>
    WRITER$ = (org.apache.avro.io.DatumWriter<WriteUserSchema>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<WriteUserSchema>
    READER$ = (org.apache.avro.io.DatumReader<WriteUserSchema>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.id);

    if (this.name == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.name);
    }

    if (this.age == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeInt(this.age);
    }

    if (this.point == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeFloat(this.point);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readInt();

      if (in.readIndex() != 0) {
        in.readNull();
        this.name = null;
      } else {
        this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
      }

      if (in.readIndex() != 0) {
        in.readNull();
        this.age = null;
      } else {
        this.age = in.readInt();
      }

      if (in.readIndex() != 0) {
        in.readNull();
        this.point = null;
      } else {
        this.point = in.readFloat();
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readInt();
          break;

        case 1:
          if (in.readIndex() != 0) {
            in.readNull();
            this.name = null;
          } else {
            this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          }
          break;

        case 2:
          if (in.readIndex() != 0) {
            in.readNull();
            this.age = null;
          } else {
            this.age = in.readInt();
          }
          break;

        case 3:
          if (in.readIndex() != 0) {
            in.readNull();
            this.point = null;
          } else {
            this.point = in.readFloat();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









