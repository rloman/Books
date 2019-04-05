package nl.yacht.books.designpatterns.visitor;

public class Application {

    public static void main(String[] args) {
        FruitBasket basket = new FruitBasket();


        Fruit pear = new Pear();
        basket.add(pear);

        basket.add(new Apple());

        basket.add(new Pineapple());

        basket.add(new Apple());

        basket.add(new Pear());

        Visitor countingVisitor = new FruitCountingVisitor();
        basket.accept(countingVisitor);

        System.out.println(countingVisitor);
    }
}
