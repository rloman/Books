package nl.yacht.books.formatting;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        final String[] teamsHome = new String[]{"Groningen", "Almelo", "Feyenoord"};
        final String[] teamsOut = new String[]{"Vitesse", "Ajax", "Utrecht"};

        final int[] goalsHome = {2, 12, 3};
        final int[] goalsOut = {1, 3, 4};

        for (int i = 0; i < teamsHome.length; i++) {
            System.out.printf(">Game %20s against %-20s has resulted in %02d-%02d<%n", teamsHome[i], teamsOut[i], goalsHome[i], goalsOut[i]);
        }
    }
}
