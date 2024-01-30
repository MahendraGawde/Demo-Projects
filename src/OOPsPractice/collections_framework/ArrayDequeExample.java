package src.OOPsPractice.collections_framework;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        //ArrayDeque can be use as queue or stack
        //As it reads from forward as well as backward direction
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.add(12);
        adq.offer(78);
        adq.offerFirst(27);
        adq.offer(34);
        adq.offerLast(29);
        adq.offer(33);
        System.out.println(adq);

        System.out.println(adq.peek());//27
        System.out.println(adq.peekFirst());//27
        System.out.println(adq.peekLast());//33

        System.out.println(adq.poll());//27
        System.out.println("poll()" +adq);

        System.out.println(adq.pollFirst());//12
        System.out.println("pollFirst()" +adq);

        System.out.println(adq.pollLast());//33
        System.out.println("pollLast()" +adq);

    }
}
