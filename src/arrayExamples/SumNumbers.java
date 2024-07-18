package src.arrayExamples;

public class SumNumbers {
    public static void main(String[] args) {
        int numbers[] = {12,23,5,16,7};
        int sum = 0;

        for (int num: numbers){
           sum += num;
        }
        System.out.println("Sum of numbers: "+ sum);
    }
}
