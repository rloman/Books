package nl.yacht.books.collections.generics;

import java.util.ArrayList;
import java.util.List;

public class DemoApp {

    public static void main(String[] args) {

        foo(new ArrayList<Animal>());

        List raw = new ArrayList();
        raw.add("#");

    }

    public static void foo(List<? super Animal> animals) {

        animals.add(new Cat());

    }
}

class Animal {

}


class Dog extends Animal {

}

class Cat extends Animal {

}