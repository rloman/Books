package nl.yacht.threads.runnable;

public class Person {

    private String name;

    private Integer age;

    private Double bankSaldo;


    public synchronized  void onlyOne() {
        age++;
    }

    // is effectively the same as
    public void onlyOne(boolean b) {
        synchronized (this.age) {
            age++;
        }
    }

    public void increment() {
        synchronized (this.bankSaldo) {
            bankSaldo++;
        }
    }

}
