package Examples.basic.StringBuilder;

import java.util.Objects;

public class ex03 {

    public static void main(String[] args) {
        task8();
    }

    static void task8() {
        /*
        Напишите метод, который принимает на вход строку (String)
        и определяет является ли строка палиндромом (возвращает boolean значение).

        Палиндро́м — число, буквосочетание, слово или текст, одинаково читающееся в обоих направлениях.
        Например, число 101; слова «топот»
         */

        String str1 = "Например";
        String str = str1.toLowerCase();
        char[] arr = str.toCharArray();
        int length = str1.length();
        String[] arr2 = new String[length];
        int count = 0;

        for (int i = length - 1; i >= 0; i--) {
            arr2[count] = String.valueOf(arr[i]);
            count++;
        }
        String str2 = String.join("", arr2);
        boolean res = Objects.equals(str1, str2);

        if (res) {
            System.out.println("Палиндро́м: " + str + " => " + str2 + " результат true");
        } else {
            System.out.println("Палиндро́м: " + str + " => " + str2 + " результат false");
        }

    }
}
