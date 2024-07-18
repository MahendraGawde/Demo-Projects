package src.arrayExamples;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] numbers = {12,23,43,2,45};

        int min = Integer.MAX_VALUE;

        for (int num: numbers){
            if(num<min){
                min = num;
            }
        }
        System.out.println("minimum number is: " +min);


    }


}
