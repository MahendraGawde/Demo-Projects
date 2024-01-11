package src.OOPsPractice.Inheritance.Single;

public class Animal {
    //Inheritance provides way to create a new class from an existing class
    //Super class | Parent class | Base class
    //Sub class | Child class | Derived class
    String breed = "normal";
    Animal(){
        System.out.println("Animal constructor");
    }
    void walk(){
        System.out.println("Animal walking");
    }
    void run(){
        System.out.println("Running animal");
    }
}
