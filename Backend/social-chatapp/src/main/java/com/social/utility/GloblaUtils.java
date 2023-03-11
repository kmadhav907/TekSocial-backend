package com.social.utility;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GloblaUtils {
    public static  final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public static final SimpleDateFormat parser = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    public static String formatDateAndTime(LocalDateTime dateAndTime){
        return dateAndTime.format(format);
    }
}
