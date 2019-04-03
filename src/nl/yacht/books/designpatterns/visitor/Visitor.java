package nl.yacht.books.designpatterns.visitor;

public interface Visitor {

    void visit(Pear pear);
    void visit(FruitBasket fruitBasket);
    void visit(Apple apple);
    void visit(Pineapple pineapple);
}
