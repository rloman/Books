package nl.yacht.books.model.inheritance.interfaces;

public class Philips implements Television {


    @Override
    public void on() {

        System.out.println("Switching Philips On");

    }

    @Override
    public void off() {

    }

    @Override
    public void switchChannel(int newChannel) {

    }
}
