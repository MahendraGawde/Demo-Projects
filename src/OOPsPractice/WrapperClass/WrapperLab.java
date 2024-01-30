package src.OOPsPractice.WrapperClass;

public class WrapperLab {

    // A Wrapper class in Java is a class whose object wraps or contains primitive data types.
    // Wrapper classes provides methods which are additional to primitive data type not have.
    // in Collection framework we use Wrapper classes
    // eg. Integer in place of int, Character in place of char etc..
    public static void main(String[] args) {
        int a=25;
        double d =25.22;
        Integer b= Integer.valueOf(a);
        String s1 =String.valueOf(d);
        System.out.println(b);
        System.out.println(s1);
    }




}
