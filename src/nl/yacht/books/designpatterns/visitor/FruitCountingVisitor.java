package nl.yacht.books.designpatterns.visitor;

public class FruitCountingVisitor implements Visitor {

    private int pears;

    @Override
    public void visit(Pear pear) {
        this.pears++;
    }

    @Override
    public void visit(FruitBasket fruitBasket) {

        for(Fruit element: fruitBasket.getFruitsInBasket()) {
            element.accept(this);
        }
    }

    @Override
    public String toString() {
        return "FruitCountingVisitor{" +
                "pears=" + pears +
                '}';
    }
}
