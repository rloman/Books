package nl.yacht.threads;

public class CounterThread extends Thread {

    private int id;

    public CounterThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for(int i = 0;i<5;i++) {
            System.out.println(Thread.currentThread().getId());
            System.out.println("Thread with id: "+id+" has value:"+i);
        }
    }
}
