package Lessons.Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ex01 {
    /*
1. Напишите метод, который заполнит массив из 1000 элементов случайными
цифрами от 0 до 24.

2. Создайте метод, в который передайте заполненный выше массив и с
помощью Set вычислите процент уникальных значений в данном массиве и
верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее
количество чисел в массиве.
 */
    public static void main(String[] args) {
        task26(crateArray(1000, 0, 24));
    }

    static Integer[] crateArray(int size, int min, int max) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(min, max);
        }
        return array;
    }

    static void task26(Integer[] arr) {
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        double percent = set.size() * 100.0 / arr.length;
        System.out.println(percent);
    }
}
