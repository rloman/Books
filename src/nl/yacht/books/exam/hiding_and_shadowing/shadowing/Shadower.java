package nl.yacht.books.exam.hiding_and_shadowing.shadowing;

public class Shadower {

    private int age = 15;

    public void foo() {
        int age = 45; //this is shadowing
    }

    public void pp() {
        System.out.println(age); // always prints '15'
    }
}
