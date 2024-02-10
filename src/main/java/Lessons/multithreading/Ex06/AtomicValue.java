package Lessons.multithreading.Ex06;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicValue implements Runnable{



    private final AtomicInteger value;
    private CountDownLatch cdl;

    public AtomicValue(int value) {
        this.value = new AtomicInteger(value);
    }
    public void inc(){
        value.incrementAndGet();
    }

    public void setCdl(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    public int getValue() {
        return value.intValue();
    }

    @Override
    public void run() {
        for (int i = 0; i<100000; i++){
                inc();
        }
        cdl.countDown();
    }

    @Override
    public String toString() {
        return String.format("(%s)", value);
    }
}
