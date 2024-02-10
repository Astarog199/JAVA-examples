package Examples.basic.HelloWorld;

public class ex04_Recursion {
    public static void main(String[] args) {
        task5(2, -2);
    }

    static void task5(int a, int b){
        /*
        Задание №6 (доп)
        Реализовать функцию возведения числа а в степень b.
        Сводя количество выполняемых действий к минимуму.
        Пример 1: а = 3, b = 2, ответ: 9
        Пример 2: а = 2, b = -2, ответ: 0.25
        Пример 3: а = 3, b = 0, ответ: 1
         */
        double res = 1;
        for (int i = 0; Math.abs(b) > i; i++) {
            res *= a;
        }
        System.out.println( b>0 ? res : 1/res);
    }
}
