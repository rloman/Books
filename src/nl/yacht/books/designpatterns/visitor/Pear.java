package nl.yacht.books.designpatterns.visitor;

public class Pear extends Fruit {

    @Override
    public void accept(Visitor visitor) {

        visitor.visit(this);

    }
}
