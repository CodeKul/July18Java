package java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateDemo {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        System.out.println(System.currentTimeMillis());

        Date date1 = new Date(1696916698251L);
        System.out.println(date1);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dateTimeFormatter.format(localDate));

        System.out.println(localDate.plusDays(1));
        System.out.println(localDate.minusDays(1));
        System.out.println(localDate.getEra());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfYear());

        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(10,20,10);
        System.out.println(localTime);

        System.out.println(localTime1.isAfter(localTime));
        System.out.println(localTime1.isBefore(localTime));


        LocalDate localDate1  = LocalDate.of(2010,10,1);
        LocalDate localDate2  = LocalDate.of(2023,10,1);

        Period period = Period.between(localDate1,localDate2);
        System.out.println(period);

        LocalTime localTime2 = LocalTime.of(10,20,10);
        LocalTime localTime3 = LocalTime.of(22,33,10);

        Duration duration = Duration.between(localTime3,localTime2);
        System.out.println(duration);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
