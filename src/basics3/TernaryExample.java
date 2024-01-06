package src.basics3;

public class TernaryExample {
    public static void main(String[] args) {
        //Ternary operator--> It is based on conditions.
        //int a = condition ? if this is  true print do this : if false do this.
        int a = true ? 10:20;
        System.out.println(a);
        int a1 = 30>40 ? 10:20;
        System.out.println(a1);
        String str = 10>20 ? "10":"TWENTY";
        System.out.println(str);
        String fb_status = true ? "Yes": "No";
        System.out.println(fb_status);
    }
}
