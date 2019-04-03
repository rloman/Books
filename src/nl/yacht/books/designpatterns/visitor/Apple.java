package nl.yacht.books.designpatterns.visitor;

public class Apple extends Fruit {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }
}
