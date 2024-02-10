package Examples.basic.multithreading.Ex06;

import java.util.concurrent.CountDownLatch;

public class intValue implements Runnable {


    private int value;

    private CountDownLatch cdl;

    public intValue(int value) {
        this.value = value;
    }

    public void inc() {
        synchronized (intValue.class) {
            value++;
        }
    }

    public void setCdl(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            inc();
        }
        cdl.countDown();
    }

    @Override
    public String toString() {
        return String.format("(%s)", value);
    }
}
