package src.basics3;

import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        // Palindrome with StringBuilder class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to check palindrome or not");
        String inputUser = sc.next();

        StringBuilder sb1 = new StringBuilder(inputUser);
        StringBuilder reverse = sb1.reverse();

        if (inputUser.contentEquals(reverse) ) {
            System.out.println("This is palindrome");

        }else {
            System.out.println("This is not a palindrome");
        }
    }
}
