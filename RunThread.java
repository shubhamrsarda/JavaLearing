package Concurrency;

public class RunThread implements Runnable{

    public void run(){
        System.out.println("In RunThread run..");

        for(int i=0;i<10;i++){
            System.out.println("Thread : " +Thread.currentThread().getId() + " i : " + i );
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
