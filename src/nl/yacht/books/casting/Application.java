package nl.yacht.books.casting;

import nl.yacht.books.model.Book;
import nl.yacht.books.model.inheritance.Animal;
import nl.yacht.books.model.inheritance.Cow;

public class Application {

    public static void main(String[] args) {
        double d1 = 3.5f;

        Object o = new Book(33);

        Animal a = new Cow();

        // very bad, almost criminal!

        long longAge = 8584733245L;

        int veryBad = (int) longAge; // never do this or you must be very sure

        System.out.println(longAge);
        System.out.println(veryBad);

        int random = (int) (Math.random() * 1000);

        System.out.println(random);
    }

    public static void foo(Animal animal) {

//        animal.moo(); // error

        if(animal instanceof Cow) {
            // true
            Cow castedCow = (Cow) animal;
            castedCow.moo();
        }



    }
}
