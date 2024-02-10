package Examples.basic.multithreading.Ex04;


import Examples.basic.multithreading.ex01.MyRunnable;
import Examples.basic.multithreading.ex01.MyThread;

//синхронность: пока первый поток не завершится второй создан не будет
// Т.Е убрали многопоточность
public class main {
    public static void main(String[] args) throws InterruptedException {
        for(int i =0; i<3; i++){
            // первый поток
           MyThread thread = new MyThread();
           thread.start();
           thread.join();
        }

        for(int i =0; i<3; i++){
            // второй поток
            Thread thread = new Thread(new MyRunnable());
            thread.start();
            thread.join();
        }
    }

}
