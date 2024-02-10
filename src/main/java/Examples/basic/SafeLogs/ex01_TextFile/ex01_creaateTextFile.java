package Examples.basic.SafeLogs.ex01_TextFile;

import java.io.FileWriter;
import java.io.IOException;

public class ex01_creaateTextFile {
    public static void main(String[] args)  {
        task10("TEST ", 5);
    }

    static void task10(String str, int n)  {
        String text = str.repeat(n);

        try (FileWriter writer = new FileWriter("src/main/java/Lessons/SafeLogs/ex01_TextFile/text.tht", true)) {
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
