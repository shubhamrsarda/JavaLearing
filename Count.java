package Concurrency;

public class Count {

    public static int counter = 1 ;

    public static Object lock = new Object();  // lock state

    // synchronized for complete execution of this method
    public    void incrementCount(){  // public synchronized static void incrementCount()
        synchronized (lock){
            int i = counter;
            System.out.println("Before Counter : " + counter + " current thread : " + Thread.currentThread().getId() );
            counter = i + 1 ;
            System.out.println("After Counter : " + counter + " current thread : " + Thread.currentThread().getId() );
        }

    }

    public static void main(String[] args) {
        Count c = new Count(); // if method not static
        for(int i = 0 ; i< 10 ; i++){
            Thread t = new Thread(()-> c.incrementCount());
            t.start();

        }
    }
}
