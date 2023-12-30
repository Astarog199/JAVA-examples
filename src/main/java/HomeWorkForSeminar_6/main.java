package HomeWorkForSeminar_6;

import java.util.*;

public class main {
    /**
     * 0. Разобраться со всеми принципами
     * 1. Написать класс, который выводит это число другого цвета. Цвет зависит от значения.
     * 1.1 Если число находится в диапазоне [0, 30] - цвет красный
     * 1.2 Если число находится в диапазоне [31, 75] - цвет желтый
     * 1.3 Если число находится в диапазоне [76, 100] - цвет зеленый
     * 1.4 Если число не входит в диапазон [0, 100] - выводим сообщение, что некорректное
     * <p>
     * PS if\else ветвление (т.е. switch) использовать нельзя.
     * <p>
     * Как работать с цветом: https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
     */

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        IndicatorColor collectionColor = new IndicatorColor();
        IndicatorColor.add(ANSI_RED, 0, 30);
        IndicatorColor.add(ANSI_YELLOW, 31, 75);
        IndicatorColor.add(ANSI_GREEN, 76, 100);


        printIndicator(24); // красный
        printIndicator(34); // желтый
        printIndicator(74); // желтый
        printIndicator(95); // зеленый
        printIndicator(100); // зеленый
        printIndicator(-5);  // некорректно
        printIndicator(101); // некорректно
    }


    static void printIndicator(int value) {
        // TODO: код вписать тут

        IndicatorColor indicatorColor = new IndicatorColor();
        System.out.println(indicatorColor.getColor(value) + value + ANSI_RESET);

    }



    public static class IndicatorColor extends CollectionColor {
        public String getColor(Integer value) {
            Map <String, ArrayList<Integer>> colors = getColors();

            for (Map.Entry<String, ArrayList<Integer>> color : colors.entrySet()) {
                ArrayList<Integer> range = colors.get(color.getKey());
                if (value >= range.get(0) && value <= range.get(1)) {
                    return color.getKey();
                }
            }

            throw new UnsupportedOperationException(("Некорректное число"));
        }

    }

    public static class CollectionColor{
        private static Map<String, ArrayList<Integer>> colors = new HashMap<>();

        public static void add(String color, int x, int y){
            ArrayList<Integer> value =new ArrayList<>();
            value.add(x);
            value.add(y);
            colors.put(color, value);
        }

        public Map<String, ArrayList<Integer>> getColors() {
            return colors;
        }

        @Override
        public String toString() {
            return "CollectionColor{" +
                    "colors=" + colors +
                    '}';
        }
    }
}