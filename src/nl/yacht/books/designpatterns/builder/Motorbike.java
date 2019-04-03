package nl.yacht.books.designpatterns.builder;

public class Motorbike {

    private Engine engine;

    private Wheel front;
    private Wheel back;

    private Motorbike(MotorbikeBuilder builder) {
        this.engine = builder.engine;
        this.front = builder.front;
        this.back = builder.back;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getFront() {
        return front;
    }

    public void setFront(Wheel front) {
        this.front = front;
    }

    public Wheel getBack() {
        return back;
    }

    public void setBack(Wheel back) {
        this.back = back;
    }

    public static class MotorbikeBuilder {

        private Engine engine;
        private Wheel front;
        private Wheel back;

        public MotorbikeBuilder(int cc) {

            this.engine = new Engine();
            this.engine.setCc(cc);

        }

        public MotorbikeBuilder front(int spokes) {
            this.front = new Wheel();
            this.front.setSpokes(spokes);

            return this;
        }

        public MotorbikeBuilder back(int spokes) {
            this.back = new Wheel();
            this.back.setSpokes(spokes);

            return this;
        }

        public Motorbike build() {
            return new Motorbike(this);
        }
    }
}
