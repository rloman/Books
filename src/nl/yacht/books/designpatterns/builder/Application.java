package nl.yacht.books.designpatterns.builder;

public class Application {

    public static void main(String[] args) {

        Motorbike.MotorbikeBuilder builder = new Motorbike.MotorbikeBuilder(500);
        builder.front(15).back(25);

        Motorbike myMotorBike = builder.build();

        // again, on steroids (irl)
        Motorbike m1 = new Motorbike.MotorbikeBuilder(500).front(3).back(25).build();

        m1 = builder.build();

        Motorbike m2 = builder.build();


        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());

    }
}
