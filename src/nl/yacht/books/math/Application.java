package nl.yacht.books.math;

import java.math.BigInteger;
import java.util.Random;

public class Application {

    public static void main(String[] args) {
        System.out.println(Math.sqrt(2));

        System.out.println(Math.PI);

        System.out.println(Math.pow(2,3));

        System.out.println(Math.random() * 1000); // WARNING: Always results to 0 (zero)

        int myRandom = (int) (Math.random() * 2000); // THIs is good

        System.out.println(myRandom);


    }

}
