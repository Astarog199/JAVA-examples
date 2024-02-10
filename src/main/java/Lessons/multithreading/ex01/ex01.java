package Lessons.multithreading.ex01;

public class ex01 {
    public static void main(String[] args) {
        for (int i = 0; i<3; i++){
            new MyThread().start();
        }

        for (int i =0; i<5; i++){
            new Thread(new MyRunnable()).start();
        }

        for (int i =0; i<5; i++){
            new Thread(() ->{
                System.out.println("3. Hello from: " + Thread.currentThread());
            }).start();
        }
    }
}
