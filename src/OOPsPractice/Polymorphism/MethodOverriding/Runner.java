package src.OOPsPractice.Polymorphism.MethodOverriding;


public class Runner {
    public static void main(String[] args) {
        // Doggy class and Hound class both having same method and in runtime if parent class reference
        // used to create child class object then at runtime it will decide which method to run.
        Doggy d = new Doggy();
        d.bark();
        Hound h = new Hound();
        h.bark();
        Doggy t = new Hound();//dynamic dispatch
        t.bark();
    }
}
