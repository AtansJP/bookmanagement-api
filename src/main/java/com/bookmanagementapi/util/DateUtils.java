package com.bookmanagementapi.util;

import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    public static String formatInstant(Instant instant) {
        return DateTimeFormatter.ISO_INSTANT.format(instant);
    }
}