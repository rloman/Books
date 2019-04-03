package nl.yacht.books.designpatterns.composite.iterator;

import nl.yacht.books.designpatterns.composite.Tree;

public class Application {

    public static void main(String[] args) {
        Tree t = new Tree();

        t.add(3);
        t.add(2);
        t.add(15);

        for(int element: t) {
            System.out.println(element);
        }
    }
}
