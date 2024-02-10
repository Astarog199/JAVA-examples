package Examples.basic.Collections.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class ex03 {
    /*
        В классе MyQueue реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди
        dequeue() - возвращает первый элемент из очереди и удаляет его
        first() - возвращает первый элемент из очереди, не удаляя
        getElements() - возвращает все элементы в очереди
        */

    public static void main(String[] args) {
        Queue<Integer> queue = MyQueue();
        getElements(queue);
        dequeue(queue);
        first(queue);
    }


    public static Queue<Integer> MyQueue(){
        //         enqueue() - помещает элемент в конец очереди
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(10);
        queue.add(15);
        queue.add(5);
        return queue;
    }

    /**
     * возвращает первый элемент из очереди и удаляет его
     */
    static void dequeue(Queue<Integer> list){

        System.out.println(list.poll() + " dequeue() - возвращает первый элемент из очереди и удаляет его");

    }
    /**
     * возвращает первый элемент из очереди, не удаляя
     */
    static void first(Queue<Integer> list){
        System.out.println(list.peek() + " first()  - возвращает первый элемент из очереди, не удаляя");
    }

    /**
     * возвращает все элементы в очереди
     */
    static void getElements(Queue<Integer> list) {
        System.out.print('[');
        for (Object element : list) {
            System.out.print(element + " ");
        }
        System.out.println(']');
    }

}
