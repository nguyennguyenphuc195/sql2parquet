package com.converter;

import java.sql.Date;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;

public class Helper {
    static public long dateToUnixDay(Date date) {
        LocalDate local_date = date.toLocalDate();
        LocalDate startDate = LocalDate.of(1970, Month.JANUARY, 1);

        long duration = Duration.between(startDate.atStartOfDay(), local_date.atStartOfDay()).toDays();
        return duration;
    }
}
