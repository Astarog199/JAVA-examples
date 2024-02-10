package Lessons.HelloWorld;

import java.util.Scanner;

public class ex01_sout {

    public static void main(String[] args) {
        task1();
    }

    static void  task1 () {
        /*
        Написать программу, которая запросит пользователя ввести <Имя> в консоли.
        Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello and welcome!");
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.printf("Hello %s!", name);
        sc.close();
    }
}

