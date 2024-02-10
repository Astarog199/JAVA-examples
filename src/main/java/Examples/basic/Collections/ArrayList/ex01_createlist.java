package Examples.basic.Collections.ArrayList;

import java.util.*;

public class ex01_createlist {
    public static void main(String[] args) {
       List<Integer> list = createlist(10, 0, 9);
        sort(list);
    }

    static List<Integer> createlist(int size, int min, int max){
        List <Integer> LIST = new ArrayList<>(size);
        for(int i =0; i <size; i++){
            LIST.add(new Random().nextInt(min, max+1));
        }
        return LIST;
    }

    static void sort(List<Integer> list){
        /*
        Заполнить список десятью случайными числами.
        Отсортировать список методом sort() и вывести его на экран
         */
        Collections.sort(list); // от min до max
        list.sort(Comparator.reverseOrder()); //от max до min
        System.out.println(list);
    }
}
