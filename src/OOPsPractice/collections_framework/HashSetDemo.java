package src.OOPsPractice.collections_framework;

import java.util.HashSet;

public class HashSetDemo {
    // Set allow unique elements and order is not preserved.
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add("A");
        h.add("C");
        h.add("J");
        h.add(null);
        h.add("Z");
        System.out.println(h.add("J"));                ;
        h.add(22);
        System.out.println(h);
    }
}
