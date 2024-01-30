package src.OOPsPractice.collections_framework;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        /*
        ArrayList and LinkedList both implements same list interface
        Hence same methods work in both.
        */

        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Mahi");
        studentsName.add("Rishi");
        studentsName.add("Vikrant");
        studentsName.add("Bhushan");
        studentsName.add("Vikas");

        System.out.println(studentsName);

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(70);
        list.add(90);
        System.out.println(list);
        list.add(5,60);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(110);
        newList.add(120);

        System.out.println(newList);
        list.addAll(newList);

        System.out.println(list);

        System.out.println(list.get(2));
        //to remove element from list with index number.
        list.remove(3);
        System.out.println(list);

        //to remove specific value from list array.
        list.remove(Integer.valueOf(110));
        System.out.println(list);

        //to remove complete list use clear method.
//        list.clear();
//        System.out.println(list);

        list.set(2,33);
        System.out.println(list);

        System.out.println(list.contains(50));





    }
}
