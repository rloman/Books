package nl.yacht.books.designpatterns.visitor;

public class Pineapple extends Fruit {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }
}
