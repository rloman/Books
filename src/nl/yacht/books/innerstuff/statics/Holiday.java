package nl.yacht.books.innerstuff.statics;

import java.time.LocalDateTime;

public class Holiday {

    private String flightTicket;
    private double money;
    private String destination;
    private int people;
    private LocalDateTime flightTime;
    private String luggage;

    private Holiday(HolidayBuilder builder) {
        this.flightTicket = builder.flightticket;
        this.money = builder.money;
        this.destination = builder.destination;
        this.flightTime = builder.flightTime;
    }

    public static class HolidayBuilder {

        private double money;
        private String destination;
        private String flightticket;
        private LocalDateTime flightTime;

        public HolidayBuilder(double money, String destination) {
            this.money=money;
            this.destination = destination;
        }

        public HolidayBuilder flightticket(String fligtticket) {
            this.flightticket = flightticket;

            return this;
        }

        public HolidayBuilder time(LocalDateTime flightTime) {
            this.flightTime = flightTime;

            return this;
        }

        public Holiday build() {
            return new Holiday(this);
        }

    }
}
