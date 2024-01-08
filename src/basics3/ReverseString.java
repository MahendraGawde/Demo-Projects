package src.basics3;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        //Reverse string using StringBuilder inbuilt method.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to reverse: ");
        String inputUser = sc.next();


        StringBuilder sb1= new StringBuilder(inputUser);
        StringBuilder reverse = sb1.reverse();
        System.out.println("Reverse string is: " +reverse);
    }
}
