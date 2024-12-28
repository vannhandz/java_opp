package stt.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateUtil {

    public  static DateTimeFormatter formatter_ddMMyyyy = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public  static DateTimeFormatter formatter_yyyyMMdd = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    // chuyen chuoi thanh locail_day dd/MM/yyyy
    public static LocalDate parseDate_ddMMyyyy(String date) {
        return LocalDate.parse(date, formatter_ddMMyyyy);
    }
    // chuyen chuoi thanh locail_day yyyy/MM/dd
    public static LocalDate parseDate_yyyyMMdd(String date) {
        return LocalDate.parse(date, formatter_yyyyMMdd);
    }

    // chuyen locailday thanh chuoi dd/MM/yyyy
    public static String parseDate_ddMMyyyy(LocalDate date) {
        return date.format(formatter_ddMMyyyy);
    }
    // chuyen locailday thanh chuoi yyyy/MM/dd
    public static String parseDate_yyyyMMdd(LocalDate date) {
        return date.format(formatter_yyyyMMdd);
    }
}
