package nl.yacht.books.designpatterns.builder.demo;

public class DemoUsage {

    public static void main(String[] args) {


        StringBuilder builder = new StringBuilder();

        builder.append(3);
        builder.append(5);
        builder.reverse();

        String result = builder.toString();

        System.out.println(result);

    }
}
