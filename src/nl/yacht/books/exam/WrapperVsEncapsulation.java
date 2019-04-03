package nl.yacht.books.exam;

import java.util.ArrayList;
import java.util.List;

public class WrapperVsEncapsulation {
}


class Wrapper {

    private int value;

    public Wrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class Encapsulation { // you might see this as a Wrapper and in fact it is


    private int value;

    public Encapsulation(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void inc() {
        this.value++;
    }



}

class EncapsulationCar {

    public int mileage;

    public int getMileage() {
        return this.mileage;
    }

    public void drive() {
        this.mileage += 10;
    }

}

class BoxDelegate <T> {

    private List<T> content = new ArrayList<>();

    public boolean add(T t) {
        return content.add(t);
    }

    public boolean remove(Object o) {
        return content.remove(o);
    }
}