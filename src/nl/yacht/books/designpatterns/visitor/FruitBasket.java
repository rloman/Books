package nl.yacht.books.designpatterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class FruitBasket extends Fruit {

    private List<Fruit> fruitsInBasket = new ArrayList<>();

    public boolean add(Fruit fruit) {
        return fruitsInBasket.add(fruit);
    }

    public List<Fruit> getFruitsInBasket() {
        return fruitsInBasket;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
