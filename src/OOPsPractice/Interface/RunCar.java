package src.OOPsPractice.Interface;

public class RunCar extends Car {
    public static void main(String[] args) {
        RunCar car = new RunCar();
        car.startCar();
        car.accelerateCar();
        car.stopCar();

    }
}
