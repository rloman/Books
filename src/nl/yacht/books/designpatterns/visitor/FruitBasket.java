package nl.yacht.books.designpatterns.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FruitBasket extends Fruit implements Iterable<Fruit> {

    private List<Fruit> fruitsInBasket = new ArrayList<>();

    public boolean add(Fruit fruit) {
        return fruitsInBasket.add(fruit);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public Iterator<Fruit> iterator() {
       return fruitsInBasket.iterator();
    }
}
