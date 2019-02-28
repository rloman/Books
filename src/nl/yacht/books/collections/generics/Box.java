package nl.yacht.books.collections.generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Number> {

    private List<T> content = new ArrayList<>();

    public void add(T t) {
        this.content.add(t);
    }

}
