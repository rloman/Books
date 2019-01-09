package nl.yacht.books.mains;

public class TimePrinter {

    public static void main(String[] args) {


        int minutes = 521;

        int hours = minutes / 60;
        int minutesAfterHour = minutes % 60;

        System.out.println("Hours: "+hours+", minutes:"+minutesAfterHour);

        System.out.printf("Time is: %d  and %d%n", hours, minutesAfterHour);

        System.out.printf("%d:%d%n", hours, minutesAfterHour);

        hours = 235;

        System.out.printf("%05d:%02d%n", hours, minutesAfterHour);
    }
}
