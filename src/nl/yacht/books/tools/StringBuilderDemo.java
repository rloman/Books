package nl.yacht.books.tools;

public class StringBuilderDemo {

    public static void main(String[] args) {
        String s = "A";

        for(int i = 0;i<1000;i++) {
            s += i;
        }

        // I made 1000 String which of only one is now usable, the rest is eligible for GC

        // good

        StringBuilder builder = new StringBuilder();
        builder.append("A");
        for(int i = 0;i<1000;i++) {
            builder.append(i);
        }

        s = builder.toString();
    }
}
