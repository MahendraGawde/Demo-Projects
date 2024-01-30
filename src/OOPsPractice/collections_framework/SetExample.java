package src.OOPsPractice.collections_framework;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        //Set type collection print unique values but as random list
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(24);
        set.add(36);
        set.add(48);
        set.add(60);
        set.add(48);
        System.out.println(set);
        System.out.println(set.size());
        
        set.clear();
        System.out.println(set);
    }
}
