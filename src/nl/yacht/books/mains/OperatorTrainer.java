package nl.yacht.books.mains;

public class OperatorTrainer {
    public static void main(String[] args) {


        int c = 0;

        System.out.println(c++);

        System.out.println(++c);

        c = -c;
        System.out.println(c);

        int b = 0b10101101;

//        b = b >> 1;

        System.out.println(b);
        b*=-1;

        System.out.println(b);

        System.out.println(b >>> 1);

//        int c2 = Integer.valueOf()

        int myAge = 50;

        String label = myAge > 50 ? "Senior" : "Medior";

        b = b +2; // is the same as ...
        b += 2; // also applies to *, /, -

        b /=2;
    }
}
