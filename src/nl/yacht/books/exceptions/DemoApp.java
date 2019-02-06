package nl.yacht.books.exceptions;

public class DemoApp {

    public static void main(String[] args) {

        String age = "monkey";

        int ageAsNumber = Integer.parseInt(age);
    }

    public static boolean isNumeric(String input ){
        try {
            Integer.parseInt(input);

            return true;
        }
        catch(NumberFormatException nfe) {
            return false;
        }
    }
}
