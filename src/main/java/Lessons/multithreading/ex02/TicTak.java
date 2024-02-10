package Lessons.multithreading.ex02;


public class TicTak implements Runnable{
    private final String bracket;
    public TicTak(String bracket) {
        this.bracket = bracket;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(bracket);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}