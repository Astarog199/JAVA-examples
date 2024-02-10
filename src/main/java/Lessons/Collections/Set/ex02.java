package Lessons.Collections.Set;

import java.util.*;

public class ex02 {
    public static void main(String[] args) {
        task25();
    }
    static void task25() {
        Integer[] arr = {1, 7, 3, 9, 5, 6, 6};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}
