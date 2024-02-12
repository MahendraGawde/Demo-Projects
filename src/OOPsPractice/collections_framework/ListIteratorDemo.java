package src.OOPsPractice.collections_framework;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

    // ListIterator is best among 3 cursor methods it has additional methods which not
    // present in Iterator and enumeration cursors
    public static void main(String[] args) {
        LinkedList l = new LinkedList<>();
        l.add("BalaKrishna");
        l.add("Chiru");
        l.add("Venky");
        l.add("Naga");

        System.out.println(l);
        ListIterator ltr = l.listIterator();

        while(ltr.hasNext()){
            String s = (String)ltr.next();
            if (s.equals("Venky")){
                ltr.remove();
            }
            else if (s.equals("Naga")){
                ltr.add("Chaitnya");
            } else if (s.equals("Chiru")) {
                ltr.set("Charan");
            }
        }
        System.out.println(l);


    }
}
