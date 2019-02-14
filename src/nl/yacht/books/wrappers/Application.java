package nl.yacht.books.wrappers;


public class Application {

    public static void main(String[] args) {

        int age = 50;

        foo(age);

        double mySalary = salary();

        double d = 3.5;

        d++;

        String myOtherLabel = "" + d;

        System.out.println(myOtherLabel);


        System.out.println(Integer.MAX_VALUE);

        int max = Integer.max(3,4);
        int myAgeAgain = Integer.parseInt("44");

        boolean b = Boolean.parseBoolean("TruE");

        System.out.println(b);

        String bin = Integer.toBinaryString(43);

        System.out.println(bin);

    }


    public static void foo(Object o) {
        System.out.println(o);
    }

    public static Double salary() {
        return 3500.00;
    }
}
