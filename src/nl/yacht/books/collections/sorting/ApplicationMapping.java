package nl.yacht.books.collections.sorting;



import java.util.HashMap;
import java.util.Map;

public class ApplicationMapping {

    public static void main(String[] args) {
        Map<Person, Integer> ages = new HashMap<>();

        ages.put(new Person("R"), 51);
        ages.put(new Person("X"), 27);

        System.out.println(ages.get(new Person("X")));

        for(Person key: ages.keySet()) {
            System.out.println(key.getName());
        }

        for(int age: ages.values()) {

        }

        for(Map.Entry<Person, Integer> somethingElse: ages.entrySet()) {
            System.out.println(somethingElse.getKey());
        }
    }
}
