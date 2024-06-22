package src.OOPsPractice.collections_framework;

import java.util.*;

//public class ComparatorTreeSetSort {
//    // new MyComparator object from static class compare added objects in customized sorted way.
//    public static void main(String[] args) {
//        TreeSet t = new TreeSet(new MyComparator());
//        t.add(10);
//        t.add(0);
//        t.add(15);
//        t.add(20);
//        t.add(20);
//        System.out.println(t);
//
//    }
//
//    static class MyComparator implements Comparator{
//        public int compare(Object obj1, Object obj2){
//            Integer I1 = (Integer)obj1;
//            Integer I2 = (Integer)obj2;
//            if(I1<I2)
//                return +1;
//            else if(I1>I2)
//                return -1;
//            else
//                return 0;
//        }
//    }
//}
public class ComparatorTreeSetSort {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>(new MyComparator());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(20);
        t.add(20);
        System.out.println(t);
    }

    static class MyComparator implements Comparator<Integer> {
        public int compare(Integer obj1, Integer obj2) {
            return obj1.compareTo(obj2); // Use the natural ordering of integers
        }
    }
}
