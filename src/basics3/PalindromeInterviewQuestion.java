package src.basics3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PalindromeInterviewQuestion {
    public static boolean isPalindrome(int number){
        int originalNumber = number;
        int rev = 0;

        while(number>0){
            int digit = number%10;
            rev = (rev*10)+digit;
            number = number/10;
        }
        return originalNumber==rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        try {
            int number = sc.nextInt();

            if(isPalindrome(number))
                System.out.println(number + " is a Palindrome");
            else
                System.out.println(number + " is not a Palindrome");
        } catch (InputMismatchException e) {
            System.out.println("Input should be an Integer");
        }

        sc.close();
        }


    }

