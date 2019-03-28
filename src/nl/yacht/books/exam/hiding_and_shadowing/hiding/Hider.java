package nl.yacht.books.exam.hiding_and_shadowing.hiding;

public class Hider {

    int speed = 120;

    public void pp() {
        System.out.println(speed);
    }
}


class Racer extends Hider {

    int speed = 230;


    public void pp() {
        System.out.println(speed);
        System.out.println(super.speed);
    }

    public static void main(String[] args) {
        new Racer().pp();

        int[] numbers = {0,1,1,2,3,5};


        System.out.println(numbers);

        System.out.println(new Racer());

        System.out.println(numbers.getClass());
    }

}
