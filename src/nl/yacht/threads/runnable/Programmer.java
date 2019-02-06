package nl.yacht.threads.runnable;

public class Programmer extends Person implements  Runnable {


    @Override
    public void run() {

        System.out.println("Programming Java and C#");

    }
}
