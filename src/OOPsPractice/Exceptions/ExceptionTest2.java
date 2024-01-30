package src.OOPsPractice.Exceptions;

public class ExceptionTest2 {
    public static void main(String[] args) {

        // Command line arguments pass through edit configurations and enter input for args[0]
        String str = args[0];
        int x = Integer.parseInt(str);
        int a = 10/x;
        System.out.println(x);
        System.out.println(a);
    }

}
