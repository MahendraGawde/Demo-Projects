package src.basics3;

public class StringExample {
    public static void main(String[] args) {
        //String is immutable.
        String str1 = "mahi";
        String str2 = new String("mahi");
        //StringBuffer and StringBuilder are classes to change Strings into mutable.
        // We can perform append, insert or delete String using StringBuffer and String Builder class
        //StringBuffer is Thread-safe and String Builder is not Thread-safe
        // which makes it faster and preferable over StringBuffer
        StringBuffer sb3 = new StringBuffer("mahi");
        StringBuilder sbf4 = new StringBuilder("mahi");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(sb3);
        System.out.println(sbf4);
    }
}
