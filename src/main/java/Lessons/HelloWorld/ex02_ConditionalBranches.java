package Lessons.HelloWorld;

import java.time.LocalTime;
import java.util.Scanner;

public class ex02_ConditionalBranches {

    public static void main(String[] args) {
        task2();
    }

    static void task2() {
        /*
        Задание №1+
        В консоли запросить имя пользователя. В зависимости от
        текущего времени, вывести приветствие вида
        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        sc.close();

        LocalTime time = LocalTime.now();
        int hour = LocalTime.now().getHour();

        if (hour >= 5 & hour< 12)
            System.out.printf("Good morning %s!", name);
        else if (hour >= 12 & hour< 18)
            System.out.printf("Good afternoon %s!", name);
        else if (hour >= 18 & hour< 23)
            System.out.printf("Good evening %s!", name);
        else System.out.printf("Good night %s!", name);
    }
}

