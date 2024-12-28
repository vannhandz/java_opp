package stt.localdate;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String date="03/10/2003";
        String date2="2003/10/03";

        LocalDate date_ddMMyyyy=LocalDateUtil.parseDate_ddMMyyyy(date);
        LocalDate date_yyyyMMdd=LocalDateUtil.parseDate_yyyyMMdd(date2);

        System.out.println(date_ddMMyyyy);
        System.out.println(date_yyyyMMdd);

        LocalDate date_current= LocalDate.now();
        String string_ddMMyyyy=LocalDateUtil.parseDate_ddMMyyyy(date_current);
        String string_yyyyMMdd=LocalDateUtil.parseDate_yyyyMMdd(date_current);
        System.out.println(string_ddMMyyyy);
        System.out.println(string_yyyyMMdd);
    }
}
