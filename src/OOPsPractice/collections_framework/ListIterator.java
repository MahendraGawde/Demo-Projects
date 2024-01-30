package src.OOPsPractice.collections_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);

        for (int i=0; i<list.size() ; i++) {
            System.out.println("Element in for loop " +list.get(i));

        }

        for (Integer integer : list) {
            System.out.println("forEach element is " + integer);

        }

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println("iterator -> " + it.next());
        }


    }
}
