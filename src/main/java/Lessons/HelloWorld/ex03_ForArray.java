package Lessons.HelloWorld;

import java.util.Locale;

public class ex03_ForArray {

    public static void main(String[] args) {
        task2();
        System.out.println("-------");
        task3();
        System.out.println("-------");
        task4();
    }

    static void task2() {
        /*
        Задание №2
        Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
        максимальное количество подряд идущих 1.
         */
        int[] arr = {1,1,0,1,1,1};
        int max=0;
        for(int i =0; i< arr.length; i++){
            if (arr[i] == 1){
                max++;
            } else {
                max = 0;
            }
        }
        String res = String.format("Maximum number of consecutive 1: %d", max);
        System.out.println(res);
    }

    static void task3(){
        /*
        Задание №3
        Дан массив numbs = [3,2,2,3] и число val = 3.
        Если в массиве есть числа, равные заданному, нужно перенести
        эти элементы в конец массива.
        Таким образом, первые несколько (или все) элементов массива
        должны быть отличны от заданного, а остальные - равны ему.
         */

        int[] numbs = {2,3,2,3,7,2,3,5};
        int val = 3;
        int el = numbs.length-1; // 4

        int box;

        for(int i =0; i <= el; i++){
            if (numbs[el] == val){
                el--;
            } else if(numbs[i] == val ){
                System.out.println("numbs[" + i +"]" + " => " + numbs[i]);
                box = numbs[el];
                numbs[el] = numbs[i];
                numbs[i] = box;
                el--;
            }
        }
        System.out.println();
        for(int x =0; x < numbs.length; x++){
            System.out.println("numbs[" + x + "]" + numbs[x]);
        }
    }

    static void task4(){
        /*
        Задание №5
        Во фразе "Добро пожаловать на курс по Java"
        переставить слова в обратном порядке.
         */

        String str = "Добро пожаловать на курс по Java";
        String[] parts = str.toLowerCase().split(" ");
        for(int i = parts.length - 1; i>=0; i--){
            if (i==parts.length - 1) {
                String box = parts[i].toUpperCase(Locale.ROOT);
                parts[i]=box;
            }
            System.out.print(parts[i] + " ");
        }
    }

}
