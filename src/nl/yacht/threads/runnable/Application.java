package nl.yacht.threads.runnable;

public class Application {

    public static void main(String[] args) {

        Thread t = new Thread(new Programmer());

        t.start();
    }
}
