package Lessons.multithreading.Ex08;

import java.util.ArrayList;
import java.util.List;

public class Ex08 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Runnable r1 = () -> {
            for (int i = 0; i <= 100; i++) {
                synchronized (list) {
                    list.add(i);
                }
            }
        };

        Runnable r2 = () -> {
            synchronized (list) {
                for (Integer value : list) {
                    System.out.print(value + " ");
                }
            }
        };
        new Thread(r1).start();
        new Thread(r2).start();

    }
}
