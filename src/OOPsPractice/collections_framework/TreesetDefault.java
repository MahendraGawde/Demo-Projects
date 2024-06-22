package src.OOPsPractice.collections_framework;

import java.util.TreeSet;

public class TreesetDefault {
    public static void main(String[] args) {
       TreeSet t = new TreeSet();
//        //small a unicode is higher than capital A ; a=97 and A=65
//        // Heterogeneous objects not allowed and also Null values not allowed in tree set.
//        t.add("A");
//        t.add("a");
//        t.add("B");
//        t.add("Z");
//        t.add("D");
//        System.out.println(t);
        System.out.println("A".compareTo("Z"));
        System.out.println("Z".compareTo("B"));
        System.out.println("A".compareTo("A"));
//        System.out.println("A".compareTo(null));

    }
}
