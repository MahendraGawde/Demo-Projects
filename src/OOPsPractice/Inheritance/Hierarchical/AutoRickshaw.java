package src.OOPsPractice.Inheritance.Hierarchical;

public class AutoRickshaw extends Vehicle{
    int seats;
    int tyres;
    AutoRickshaw(int seats,int tyres){
        this.seats=seats;
        this.tyres=tyres;
        System.out.println("Auto 2 seats and 3 tyres");
    }

}
