package src.basics3;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the string to reverse: ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                throw new IllegalArgumentException("Input cannot be empty.");
            }

            String str = input;
            String rev = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }
            if (str.equalsIgnoreCase(rev)) {
                System.out.println("This is a Palindrome");
            } else {
                System.out.println("This is not a Palindrome");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }

    }
}
