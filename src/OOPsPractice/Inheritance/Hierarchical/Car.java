package src.OOPsPractice.Inheritance.Hierarchical;

public class Car extends Vehicle{
    int seats;
    int tyres;
    String make;
    String color;

    Car(int cSeats, int cTyres){
        System.out.println("Car seats");
        this.seats=cSeats;
        this.tyres=cTyres;
    }


    void engine(){
        System.out.println("Car Engine Started..");

    }
    void carBody(String cColor, String cMake){
        this.color=cColor;
        this.make=cMake;
    }

}
