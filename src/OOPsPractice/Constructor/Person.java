package src.OOPsPractice.Constructor;

public class Person {
    //variables out side of Main method called Instance variables
    String name;
    int age;
    boolean isMarried;
    long phoneNo;

    Person(){
        name= "mahi";
        System.out.println("Default constructor called");
    }

    Person(String name){
        System.out.println(name);
    }


    void printDetails(){
        System.out.println(name);
        System.out.println(isMarried);
        System.out.println(age);
        System.out.println(phoneNo);
    }

}
