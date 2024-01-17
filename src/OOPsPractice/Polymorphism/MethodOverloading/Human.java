package src.OOPsPractice.Polymorphism.MethodOverloading;

//Same method name but return type is different then JVM at compile time decide which method to run.
public class Human {
    void speak(int x)
    {
        System.out.println("integer value " +x);

    }
    String speak(String money){
        System.out.println("Speaking money " +money);
        return money;
    }
}
