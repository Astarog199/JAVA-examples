package Lessons.multithreading.ex03;

import java.util.Scanner;

public class StatsHelper {
private static int cnt = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread readThread = new Thread(() ->{
            Scanner in = new Scanner(System.in);
            while (in.hasNextLine() && !Thread.interrupted()) {
                String line = in.nextLine();
                cnt++;
            }
        });
        readThread.setDaemon(true);
        readThread.start();
//        readThread.interrupt(); // Прерывает поток

        while (true){
            System.out.println(cnt +" mes inputted by user");
            Thread.sleep(5000);
        }
    }


}
