package nl.yacht.books.designpatterns.visitor;

public interface Visitor {

    void visit(Pear pear);
    void visit(FruitBasket fruitBasket);
}
