package src.basics2;

import java.util.Scanner;

public class Lab003 {



    public static void main(String[] args) {



//        Grade calculator
//        Based on score will be display grades "A","B","C","D","F"
//        Score range: 90 -100 - A
//        80-89 - B
//        70-79 - C
//        60-69 - D
//        0-59 - F
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Score:");
        int score = sc.nextInt();

        if(score >=90 && score <=100){
            System.out.println("Your Grade is A");
        } else if (score >=80 && score <=89) {
            System.out.println("Your Grade is B");
        } else if (score >=70 && score <=79) {
            System.out.println("Your Grade is C");
        } else if (score >=60 && score <=69) {
            System.out.println("Your Grade is D");
        } else{
            System.out.println("Your Grade is F");
        }
    }
}
