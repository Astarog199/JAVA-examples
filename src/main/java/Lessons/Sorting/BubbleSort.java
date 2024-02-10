package Lessons.Sorting;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class BubbleSort {

    public static void main(String[] args) {

        BubbleSort(new int[]{9, 4, 8, 3, 1});
//        BubbleSort(new int[]{9, 3, 4, 8, 2, 5, 7, 1, 6, 10});
//        BubbleSort(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
    }

    static void BubbleSort(int[] mas) {

        int length = mas.length;

        StringBuilder res = new StringBuilder();

            for (int i = 0; i < mas.length; i++) {

                for (int j = 0; j < mas.length - i - 1; j++) {
                    if (mas[j] > mas[j + 1]) {
                        int temp = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j + 1] = temp;

                    }
                }

                res.append('[');
                for (int key = 0; key < length; key++) {
                    res.append(mas[key]).append(',').append(" ");
                    if (key == length - 1) {
                        res.deleteCharAt(res.length() - 1).deleteCharAt(res.length() - 1);
                        res.append(']').append("\n");
                    }
                }
                String text = String.valueOf(res);
                System.out.println(text);

        }
    }
}



