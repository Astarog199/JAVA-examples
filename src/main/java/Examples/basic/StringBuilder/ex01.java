package Examples.basic.StringBuilder;

public class ex01 {
    public static void main(String[] args) {
        System.out.println(task6('h', 'a', 20));
    }

    static String task6(char c1, char c2, int n) {
        /*
        Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
        которая состоит из чередующихся символов c1 и c2, начиная с c1.
         */

        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < n / 2; j++) {
            stringBuilder.append(c1).append(c2);
        }
        return stringBuilder.toString();
    }
}
