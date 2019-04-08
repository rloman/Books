package nl.yacht.books.designpatterns.iterator;

public class Application {

    public static void main(String[] args) {
        PrimeIterator primeIterator = new PrimeIterator(1, 30);


        // old school but still rocking
        while(primeIterator.hasNext()) {
            System.out.println(primeIterator.next());
        }

        primeIterator = new PrimeIterator(1, 30);

        // newer way
        for (long element : primeIterator) {
            System.out.println(element);
        }

        for (long element : primeIterator) {
            // should not come here! Since iterator is supposed to run only once
            throw new AssertionError();
        }
        primeIterator = new PrimeIterator(100, 125);

        for (long element : primeIterator) {
            // should come here since we created a new iterator here
            System.out.println(element);
        }
    }
}
