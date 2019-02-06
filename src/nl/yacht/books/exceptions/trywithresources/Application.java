package nl.yacht.books.exceptions.trywithresources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Application {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new URL("http://www.w3c.org/").openStream()))) {
            reader.lines().forEach(line -> {
                System.out.println(line);
            });
        } catch (IOException exception) {

            System.out.println("IOException");
        }

    }
}
