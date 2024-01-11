package src.OOPsPractice.Constructor;

public class ConstructorExample {
    public static void main(String[] args) {
        //instance variables from class have default values where local variables not have default values.
        Person p1= new Person();
        p1.printDetails();
        Person p2 = new Person("Sandeep");
        p2.printDetails();

    }
}
