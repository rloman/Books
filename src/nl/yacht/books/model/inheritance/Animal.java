package nl.yacht.books.model.inheritance;

public abstract class Animal {

    private String name;

    private double weight;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void eat();
}
