package OOPS.AbstractClasses.question7;

public class Car extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("starting  car engine.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stoping car engine.");
    }
}
