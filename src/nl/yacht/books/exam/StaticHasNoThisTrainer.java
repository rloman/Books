package nl.yacht.books.exam;

public class StaticHasNoThisTrainer {

    private int age;

    public int getAge() {
        return this.age;
    }

    public static void getAgeByStaticFAILS() {
//        return this.age;// COMPILE ERROR HERE!!!!!!!!!!!!


    }
}
