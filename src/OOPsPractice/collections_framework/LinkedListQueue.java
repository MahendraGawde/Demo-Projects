package src.OOPsPractice.collections_framework;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {

        /*
        add(), offer() adds element in queue
        element(), peek() returns first element in queue
        remove(), poll() remove element from queue
        add(),element() and remove() throws exception if there
        are no elements in queue. while its simultaneous
        */
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(5);
        queue.offer(7);
        queue.offer(9);
        queue.offer(11);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);


    }
}
