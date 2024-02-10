package Lessons.Collections.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class ex02 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        ll.add("One");
        ll.add(2);
        ll.add("Two");
        System.out.println(ll);
        System.out.println(hw1(ll));
    }
    static LinkedList<Object> hw1(LinkedList<Object> ll) {
        /*
        Напишите класс LLTasks с методом revert, который принимал бы на вход LinkedList и возвращает “перевернутый” список.
        // Дан
        [1, One, 2, Two]

        // Вывод
        [1, One, 2, Two]
        [Two, 2, One, 1]
         */

        LinkedList<Object> list = new LinkedList<Object>();
        ListIterator<Object> iterator = ll.listIterator(ll.size());
        while (iterator.hasPrevious()){
            list.add(iterator.previous());
        }

        return list;
    }
}
