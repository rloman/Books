package nl.yacht.books.innerstuff;

public class Car {

    private String licensePlate;

    private boolean running;

    private Engine engine;

    public Car() {
        this.engine = new Engine();

        System.out.println(this.engine.cc);
    }

    public void start() {
        this.engine.start();
    }

    private class Engine {
        private int cc;
        private boolean running;

        public void start() {
            Car.this.running = true;
        }
    }
}
