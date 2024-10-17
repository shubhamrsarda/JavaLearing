package Concurrency;

public class App {
    public static void main(String[] args) {

        // way to create thread
        Thread t = new Thread(() -> System.out.println("Runnable : " + Thread.currentThread().getId()));
        t.start();
        System.out.println("Main : " + Thread.currentThread().getId());


        // extending Thread class
//        CustomThread ct = new CustomThread();
//        ct.run();

        // thread using runnable interface
        Thread t2 = new Thread(new RunThread());
          t2.start();
        try {
            t2.join(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Thread t3 = new Thread(new RunThread());
        t3.start();

    }
}
