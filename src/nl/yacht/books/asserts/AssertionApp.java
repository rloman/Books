package nl.yacht.books.asserts;

public class AssertionApp {

    public static void main(String[] args) {

        int a = 4;
        int b = 0;


        if (b != 1) {
            System.out.println(divide(a, b));
        }


    }

    private static int divide(int a, int b) {

        // precondition
        assert (b != 0) : "b should have a non zero value";



        // postcondition
        // for demo purposes

        int result = a/b;

        assert (result <= a) : "here the message";


        return result;

    }
}
