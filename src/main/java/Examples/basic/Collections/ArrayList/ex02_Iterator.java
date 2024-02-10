package Examples.basic.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ex02_Iterator {

    public static void main(String[] args) {
        task14();
    }

    static void task14 ( ) {
        /*
        Создать список типа ArrayList<String>.
        Поместить в него как строки, так и целые числа.
        Пройти по списку, найти и удалить целые числа
         */

        List list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add("text");
        list.add(1.2);

        System.out.println(list); //[1, 2, text, 1.2]

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Integer) {
                iterator.remove();;
            }
        }
        System.out.println(list); //[text, 1.2]
    }
}
