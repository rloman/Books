package nl.yacht.books.designpatterns.visitor;

public class Pear extends Fruit {

    @Override
    public void accept(Visitor v) {

        v.visit(this);

    }
}
