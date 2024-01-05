package src.basics2;

import java.util.Scanner;

public class Lab004 {

//    Take input of triangle side and system should tell
//    whether its Equilateral or Isosceles or Scalene
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter side1, side2 and side3, I will tell you type of triangle");
    int side1 = sc.nextInt();
    int side2 = sc.nextInt();
    int side3 = sc.nextInt();

    if((side1 == side2) && (side2 == side3)){
        System.out.println("Equilateral triangle");
    } else if ((side1 == side2) || (side2 == side3) || (side1 == side3)) {
        System.out.println("Isosceles triangle");
    } else {
        System.out.println("Scalene triangle");
    }
}



}
