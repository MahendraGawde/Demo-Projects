package src.OOPsPractice.Inheritance.Hierarchical;

public class Vehicle {
    int tyres;
    int seats;
    String color;
    String make;
    Vehicle(){
        //System.out.println("Vehicle constructor");


    }
    Vehicle(int seats, int tyres){
        System.out.println("Vehicle seats");
        this.seats =seats;
        this.tyres=tyres;

    }
    Vehicle(String vColor,String vMake){
        this.color=vColor;
        this.make=vMake;
    }

    void breaks(){
        System.out.println("Break applied Vehicle stopped..");
    }
    void engine(){
        System.out.println("Vehicle Engine Started..");
    }
    void accelerate(){
        System.out.println("Accelerate speed");
    }


}
