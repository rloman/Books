package nl.yacht.threads.demoinnerclassrunnable;

public class Application {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous inner class!!!");
            }
        }).start();
    }
}
