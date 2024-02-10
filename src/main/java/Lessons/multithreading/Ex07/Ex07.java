package Lessons.multithreading.Ex07;


public class Ex07 implements Runnable{

    public static void main(String[] args) {
        System.out.println(Thread.currentThread());

        Thread tic = new Thread(new Ex07("tic"));
        Thread tac = new Thread(new Ex07("tac"));
//        tic.setDaemon(true);
//        tac.setDaemon(true);
        tic.start();
        tac.start();
    }
    private final String bracket;
    private final Object monitor;

    public Ex07(String bracket) {
        this.monitor = Ex07.class;
        this.bracket = bracket;
    }

    @Override
    public void run() {
        while (true){
            synchronized (monitor){
            System.out.println(bracket);
            try {
                Thread.sleep(1000);
                monitor.notify();
                monitor.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }}
    }
}
