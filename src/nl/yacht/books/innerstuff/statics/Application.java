package nl.yacht.books.innerstuff.statics;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {

        Holiday.HolidayBuilder b = new Holiday.HolidayBuilder(350.00, "Podos");

        Holiday greece = b.flightticket("KV123").time(LocalDateTime.now().plusMonths(3)).build();

        System.out.println(greece);

    }
}
