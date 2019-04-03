package nl.yacht.books.enums;

public enum Beer {

    BIG(3), SMALL(1), LARGE(25);

    int value;

     Beer(int value) {
        this.value = value;

    }
}


class BeerDrinker {

    private final int value;

    BeerDrinker() {
        this.value = 45;
    }

    BeerDrinker(String name) {
       this();
    }

    public void bar() {
//        this.value++;
    }

    public final void foo() {

    }

}

class BelgiumBeerDrinker extends BeerDrinker {

    // error since foo is final in parent class
//    public void foo() {

//    }

}
