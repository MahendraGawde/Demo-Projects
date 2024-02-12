package src.OOPsPractice.collections_framework;

import src.basics1.WhileLoop;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        for (int i = 0; i < 11; i++) {
            al.add(i);
        }
        System.out.println(al);

        Iterator itr = al.iterator();
        while(itr.hasNext()){
            Integer num = (Integer)itr.next();
            if (num%2 == 0)
                System.out.println(num);

        }
        System.out.println(al);
    }
}
