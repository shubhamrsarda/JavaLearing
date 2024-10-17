package Concurrency;

public class CustomThread extends Thread{
    public void run() {
        System.out.println("In Custom Thread Run : " + Thread.currentThread().getId());
    }

}
