package nl.yacht.books.designpatterns.visitor;

public class Application {

    public static void main(String[] args) {
        FruitBasket b = new FruitBasket();
        Fruit pear = new Pear();
        b.add(pear);

        Visitor countingVisitor = new FruitCountingVisitor();
        b.accept(countingVisitor);

        System.out.println(countingVisitor);
    }
}
