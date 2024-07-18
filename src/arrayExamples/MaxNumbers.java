package src.arrayExamples;

public class MaxNumbers {
    public static void main(String[] args) {
        int[] numbers = {12,23,43,2,45};
        int max = 0;

        for(int number: numbers){
            if(number>max){
                max = number;
            }
        }
        System.out.println(" Max number is: " +max);
    }
}
