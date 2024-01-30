package src.OOPsPractice.collections_framework;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        //PriorityQueue sorted based on priority and display output
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(20);
        pq.offer(10);
        pq.offer(29);
        pq.offer(37);

        System.out.println(pq);

        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);

      /*  Output:
        [10, 20, 29, 37]
        10
        [20, 37, 29]
*/
    }
}
