package Concurrency;

import java.util.concurrent.Callable;

public class CallThread implements Callable<Object> {

    public Object call(){
        System.out.println("In callable call..");
        return new Object();
    }
}
