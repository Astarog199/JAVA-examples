package Examples.basic.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ex01 {

    public static void main(String[] args) {
        task16();
    }
    static void task16() {
        /*
        Задание №0
            1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
            2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
            Сравните с предыдущим
         */
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new LinkedList<Integer>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            list1.add(0, i);
            System.out.println(list1);
        }

        long midle = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            list2.add(0, i);
        }
        long finish = System.currentTimeMillis();

        System.out.println("ArrayList: " + (midle - start)); //ArrayList:  45762

        System.out.println("LinkedList: " + (finish - midle)); //LinkedList: 90


        /*
        вывод: ArrayList заполняется эл-ми быстрее чем LinkedList,
        так как в LinkedList помимо того что добавляются эл-ты,
        но и каждому отдельному эл-ту присваивается ссылка
         */
    }
}
