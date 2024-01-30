package src.OOPsPractice.Exceptions;

public class ExceptionTest1 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.trim());
        } catch (Exception e) {
            System.out.println("You can't trim null value");;
        }
        System.out.println("In End of Program");
    }
}
