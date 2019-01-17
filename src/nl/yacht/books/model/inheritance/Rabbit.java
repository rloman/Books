package nl.yacht.books.model.inheritance;

public class Rabbit extends Animal {

    public void peep() {
        System.out.println("Peep ... ");
    }

    @Override
    public void eat() {

        System.out.println("Eating rabbit!");

    }
}
