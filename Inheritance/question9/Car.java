package OOPS.Inheritance.question9;

public class Car extends Vehicle {
    public int getNoOfSeats() {
        return noOfSeats;
    }

    private int noOfSeats;

    public Car(String make, String model, int year, String feulType, double fuelEfficiency, int noOfSeats) {
        super(make, model, year, feulType, fuelEfficiency);
        this.noOfSeats = noOfSeats;
    }
    @Override
    public double calculateFuelEfficiency() {
        return getFuelEfficiency()*(1.0 / (1.0 + (getNoOfSeats() / 5.0)));
    }

    @Override
    public double calculateDistanceTravelled() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public double getmaxSpeed() {
        return 120.0;
    }

}
