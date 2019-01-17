package nl.yacht.books.model.inheritance;

public class Application {

    public static void main(String[] args) {
        Animal a = new Rabbit();

        a.setName("Witje");

        System.out.println(a.getName());

        // r is here a Rabbit! (during compile (typing) and running!!!
        Rabbit r = new Rabbit();
        r.setName("Witje");
        r.peep();

        System.out.println(r.getName());

        // a2 is here an Animal during compile time (typing) and during runtime a Rabbit!!!
        Animal a2 = new Rabbit();

    }
}
