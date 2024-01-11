package src.OOPsPractice.Inheritance.Single;

import src.OOPsPractice.Inheritance.Single.Animal;

public class Dog extends Animal {
    int age=10;
    String breed = "Bull dog";

    String name="bruno";

    void bark(){
        System.out.println("Bark ..!" +this.breed +" " +name);

    }

}
