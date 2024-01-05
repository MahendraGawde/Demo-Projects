package src;

import java.util.Scanner;

public class Sum {


    public static void main(String[] args) {
        int a,b,sum;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Type a number");
        a = myObj.nextInt();

        System.out.println("Type next number");
        b = myObj.nextInt();

        sum = a+b;
        System.out.println("Sum is: " + sum);

    }
}
