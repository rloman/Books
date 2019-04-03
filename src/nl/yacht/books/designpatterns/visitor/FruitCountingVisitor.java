package nl.yacht.books.designpatterns.visitor;

public class FruitCountingVisitor implements Visitor {

    private int apples;
    private int pears;
    private int pineApples;

    @Override
    public void visit(Pear pear) {
        this.pears++;
    }

    @Override
    public void visit(FruitBasket fruitBasket) {

        for(Fruit element: fruitBasket) {
            element.accept(this);
        }
    }

    @Override
    public void visit(Apple apple) {
        this.apples++;
    }

    @Override
    public void visit(Pineapple pineapple) {
        this.pineApples++;
    }

    @Override
    public String toString() {
        return "FruitCountingVisitor{" +
                "apples=" + apples +
                ", pears=" + pears +
                ", pineApples=" + pineApples +
                '}';
    }
}
