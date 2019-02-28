package nl.yacht.books.collections.sorting;

import java.io.Serializable;
import java.util.*;

public class Application {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(0, 1, 1, 2, 56, 23, 44, 52, 3, 456, 23, 111, 22));

        System.out.println(numbers);

        Collections.sort(numbers);

        System.out.println(numbers);

        List<Person> people = new ArrayList<>();
        people.add(new Person("Jansen"));
        people.add(new Person("Yacht"));
        people.add(new Person("Poedel"));

        Collections.sort(people);

        System.out.println(people);

        Collections.sort(people, new PersonComparatorReverse());

        System.out.println(people);
    }
}

class PersonAgeCompator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
       return o1.getAge() - o2.getAge();
    }
}


class PersonComparatorReverse implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

class Person implements Comparable<Person>, Serializable {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    public String getName() {
        return name;
    }

    @Override

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}