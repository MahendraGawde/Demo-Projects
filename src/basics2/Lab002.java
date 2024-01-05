package src.basics2;

import java.util.Scanner;

public class Lab002 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        System.out.println("Enter number ->" +number);

        if(number==20){
            System.out.println("Number is equal to 20");
        } else if (number<20) {
            System.out.println("Number is less than 20");
        }else {
            System.out.println("Number is out of range");
        }
    }
}
