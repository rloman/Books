package nl.yacht.books.collections.generics;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0,1,2);

        Box<Double> stringBox = new Box<>();

        stringBox.add(3.0);
    }
}
