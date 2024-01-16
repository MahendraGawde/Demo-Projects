package src.OOPsPractice.Inheritance.Hierarchical;

public class Runner {
    public static void main(String[] args) {
        AutoRickshaw tataRickshaw = new AutoRickshaw(2,3);
        Car bmw = new Car(4,4);
        Vehicle audi = new Car(6,4);
        Vehicle truck =new Vehicle(2,4);
        Vehicle cycle = new Vehicle();
        cycle.accelerate();

        truck.engine();
        bmw.engine();
        tataRickshaw.engine();
        audi.engine();
        bmw.accelerate();
        bmw.breaks();
        bmw.carBody("Blue","SUV");
        Vehicle audiCool = new Vehicle("Black","THAR");
        System.out.println(audiCool.color="Pink");
    }
}
