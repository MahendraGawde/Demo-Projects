package src.OOPsPractice.Interface;

public class Car implements Engine,Breaks,Accelerate {

    void startCar(){
        System.out.println("Start car..");
        engineTurbo();
    }

    void stopCar(){
        System.out.println("Apply breaks");
        backBreak();
        frontBreak();
        System.out.println("Breaks are fine");

    }
    @Override
    public void engineTurbo() {
        System.out.println("Start Engine");

    }


    @Override
    public void frontBreak() {
        System.out.println("front break applied");
    }

    @Override
    public void backBreak() {
        System.out.println("back break applied");

    }

    @Override
    public void accelerateCar() {
        System.out.println("Acclerate Car");
    }
}
