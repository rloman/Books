package nl.yacht.books.tools;

public class BookMath {

    public static int max(int first, int ... rest) { // rest is here a vararg

       int max = first;
       for(int element: rest) {
           if (element > max) {
               max = element;
           }
       }

       return max;
    }

}
