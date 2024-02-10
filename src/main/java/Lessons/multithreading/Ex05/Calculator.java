package Lessons.multithreading.Ex05;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Task> queue = new ArrayDeque<>();// очередь

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Thread taskService = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(2000);
                    executor.submit(() -> {
                        Task task = queue.poll();
                        if (task != null) {
                            System.out.print("Task: " + task);
                            task.run();
                        }
                    });
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        taskService.start();

        while (in.hasNextLine()) {
            //1+2
            String[] tokens = in.nextLine().split("\\+");
            int left = Integer.parseInt(tokens[0]);
            int right = Integer.parseInt(tokens[1]);
            Task task = new Task(left, right);
            queue.add(task);
        }
    }
}
