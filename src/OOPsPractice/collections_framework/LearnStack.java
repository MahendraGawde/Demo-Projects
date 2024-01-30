package src.OOPsPractice.collections_framework;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        //Stack Example it is concept of which item push
        //first come last go basis
        Stack<String> fruits = new Stack<>();

        fruits.push("Mangoes");
        fruits.push("Apples");
        fruits.push("Kiwis");
        fruits.push("Banana");
        fruits.push("Grapes");

        System.out.println("Stack of fruits: " +fruits);
        System.out.println(fruits.peek());
        fruits.pop();
        System.out.println(fruits.peek());

    }
}
