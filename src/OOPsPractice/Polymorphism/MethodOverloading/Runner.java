package src.OOPsPractice.Polymorphism.MethodOverloading;

public class Runner {
    public static void main(String[] args) {
        Human person1 = new Human();
        person1.speak("test");
        person1.speak(100);
    }

}
