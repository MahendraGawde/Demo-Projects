package src.basics1;

public class DesignPattern {

    public static void main(String[] args) {
        for (int i=0; i<=5; i++) {
            System.out.println(" *" );
            for (int j = 1; j < 7-i; j++) {
                System.out.print(" "+j);
            }
        }
    }
}
