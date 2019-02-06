package nl.yacht.threads;

public class Application {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 25; i++) {
            Thread t = new CounterThread(i);
            t.interrupt();
            t.start();
            t.join();
        }

        System.out.println(Thread.currentThread().getId());
    }
}
