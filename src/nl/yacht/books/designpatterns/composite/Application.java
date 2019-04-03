package nl.yacht.books.designpatterns.composite;

public class Application {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(5);
        tree.add(3);
        tree.add(2);
        tree.add(8);

        tree.pp();

        System.out.println(tree.size());
    }
}
