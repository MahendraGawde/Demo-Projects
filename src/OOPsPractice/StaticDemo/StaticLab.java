package src.OOPsPractice.StaticDemo;

public class StaticLab {

    public static void main(String[] args) {
        Fruit apple= new Fruit("red","kashmiri apple");
        Fruit banana= new Fruit("yellow","kerala ka kela");
        System.out.println(apple.kg=2);
        apple.fruitDetails();
        banana.fruitDetails();
        System.out.println(banana.dozen=7);

        //static method call through class reference variable
        Fruit avacado = null;
        avacado.fruitTransport();

        Fruit.fruitTransport();
        System.out.println(Fruit.trucks_in_godawn);
    }

}

class Fruit{
    String color;
    String type;
    int kg;
    int dozen;
    static int  trucks_in_godawn= 5;
    {
        System.out.println("IIB");
    }
    static {
        System.out.println("SIB");
    }
    Fruit(String color,String type){
        this.color= color;
        this.type=type;
    }

    void fruitDetails(){
        System.out.println("Color of fruit "+color);
        System.out.println("Type of fruit " +type);
    }

    static void fruitTransport(){
        System.out.println(trucks_in_godawn);
    }
}

