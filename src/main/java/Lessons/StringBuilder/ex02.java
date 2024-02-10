package Lessons.StringBuilder;

public class ex02 {
    public static void main(String[] args) {
        task7("aaaabbbcdd");
    }
    static void task7(String str) {
        /*
        Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd => a4b3c1d2
         */
        int count = 0; //счётчик
        char[] chars = str.toCharArray(); // создаём из строки массив
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i - 1]) {
                stringBuilder.append(chars[i - 1]).append(count + 1);
                count = 0;
            } else {
                count++;
            }
        }
        stringBuilder.append(chars[chars.length - 1]).append(count + 1);
        System.out.println(stringBuilder);
    }
}
