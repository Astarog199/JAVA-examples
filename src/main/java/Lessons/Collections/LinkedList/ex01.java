package Lessons.Collections.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class ex01 {
    public static void main(String[] args) {
        task20();
    }

    static void task20(){
        /*
        Написать метод, который принимает массив элементов, помещает их в
        очередь и выводит на консоль содержимое очереди.
         */
        int [] arr = new int[]{5, 1, 6, 2, 3, 4};
        Queue<Integer> queue = new LinkedList<>();
        for (int i =0; i<arr.length; i++){
            queue.add(arr[i]);
        }

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
