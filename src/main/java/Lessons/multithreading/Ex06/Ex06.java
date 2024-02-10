package Lessons.multithreading.Ex06;

import java.util.concurrent.CountDownLatch;

/*
Код представляет собой простую многопоточную программу на Java.
Он создает три потока, каждый из которых выполняет одну и ту же задачу,
представленную классом AtomicValue. Задача просто увеличивает значение на 100 000 в цикле,
а затем вызывает countDown() для CountDownLatch.

CountDownLatch используется для синхронизации выполнения основного потока до тех пор,
пока все три потока не завершат свои задачи. Когда все три потока завершатся,
CountDownLatch освобождается, и основной поток может продолжить работу.

Наконец, значение задачи выводится на консоль. Значение должно быть 300000,
поскольку каждый поток увеличивал значение на 100000.

Программа правильна в том смысле, что она делает то, для чего предназначена.
Однако стоит отметить, что использование CountDownLatch таким образом — не самый
эффективный и элегантный способ синхронизации потоков в Java.
В большинстве случаев лучше использовать синхронизатор,
например CyclicBarrier или Exchanger.
 */

public class Ex06 {
    public static void main(String[] args) throws InterruptedException {
        atomicValue();
        intValue();
    }

    static void atomicValue() throws InterruptedException {
        long start = System.currentTimeMillis(); // начало отсчёта
        AtomicValue task = new AtomicValue(0);
        CountDownLatch cdl = new CountDownLatch(3);
        task.setCdl(cdl);
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(task);
            thread.start();
        }
        cdl.await();
        System.out.println(task.getValue());
        long end = System.currentTimeMillis(); // конец отсчёта
        System.out.println("Time: " + (end - start) + "ms."); // таймер
    }

    static void intValue() throws InterruptedException {
        long start = System.currentTimeMillis(); // начало отсчёта
        intValue task = new intValue(0);
        CountDownLatch cdl = new CountDownLatch(3);
        task.setCdl(cdl);
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(task);
            thread.start();
        }
        cdl.await();
        System.out.println(task.getValue());
        long end = System.currentTimeMillis(); // конец отсчёта
        System.out.println("Time: " + (end - start) + "ms."); // таймер
    }
}
