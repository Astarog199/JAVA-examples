package Lessons.multithreading.ex02;

public class ex02 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());

        Thread tic = new Thread(new TicTak("["));
        Thread tac = new Thread(new TicTak("]"));
//        tic.setDaemon(true);
//        tac.setDaemon(true);
        tic.start();
        tac.start();
    }
}
