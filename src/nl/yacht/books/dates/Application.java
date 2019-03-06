package nl.yacht.books.dates;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;

public class Application {

    public static void main(String[] args) {
        String date = "1992-01-09";

        Date d1 = new Date();
        d1.setYear(92);
        d1.setMonth(0);
        ;
        d1.setDate(9);

        System.out.println(d1);

        System.out.println();

        Date d2 = new Date(); // now

        System.out.println(d2);

        // Get msec from each, and subtract.
        long diff = d2.getTime() - d1.getTime();
        long diffSeconds = diff / 1000;
        long diffMinutes = diff / (60 * 1000);
        long diffHours = diff / (60 * 60 * 1000);
        long diffDays = diff / (60 * 60 * 1000 * 24);
        long yearsDividor = 60L * 60L * 1000L * 24L * 365L; // :-)
        System.out.println(yearsDividor);
        long diffYears = diff / (yearsDividor);
        System.out.println("Time in seconds: " + diffSeconds + " seconds.");
        System.out.println("Time in minutes: " + diffMinutes + " minutes.");
        System.out.println("Time in hours: " + diffHours + " hours.");
        System.out.println("Time in days: " + diffDays + " days.");
        System.out.println("Time in years: " + diffYears + " years.");

        // now java.time

        LocalDate localDateXander = LocalDate.parse(date);
        System.out.println(localDateXander);

        System.out.println(ChronoUnit.DAYS.between(localDateXander, LocalDate.now()));
        System.out.println(ChronoUnit.YEARS.between(localDateXander, LocalDate.now()));

        Period p = Period.between(localDateXander, LocalDate.now());

        System.out.printf("Sander is %d years and %d months and %d days%n", p.getYears(), p.getMonths(), p.getDays());

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(zonedDateTime);


        String label = zonedDateTime.format(DateTimeFormatter.BASIC_ISO_DATE);

        label = zonedDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        label = zonedDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        System.out.println(label);

        LocalDateTime again = LocalDateTime.parse(label);

        System.out.println(again);

//        Duration d = Duration.between(LocalDate.now().minusDays(3), LocalDate.now()); // => LocalDateTime

        // new

        LocalDate xander = LocalDate.of(1992, 9, 1);

        long xanderHere = ChronoUnit.DAYS.between(xander, LocalDate.now());

        System.out.println("Xander is here for: "+xanderHere);

    }
}
