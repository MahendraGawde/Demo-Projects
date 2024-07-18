package src.basics1;

public class BreakAndContinue {
    public static void main(String[] args) {
        /*for (int i = 0; i <=20 ; i+=2) {
            System.out.println(i);
            if (i >= 10) {
                break;
            }*/

        int i =0;
        while(i<5){
            System.out.println(i);
            i++;
            if(i==3){
                break;
            }

        }
    }

}
