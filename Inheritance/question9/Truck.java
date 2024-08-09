package OOPS.Inheritance.question9;

public class Truck extends Vehicle{
    private double cargoCapacity;

    public Truck(String make, String model, int year, String feulType, double fuelEfficiency, double cargoCapacity) {
        super(make, model, year, feulType, fuelEfficiency);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public double calculateFuelEfficiency() {
        return getFuelEfficiency()*(1.0 / (1.0 + (getCargoCapacity() / 1000.0)));
    }

    @Override
    public double calculateDistanceTravelled() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public double getmaxSpeed() {
        return 80.0;
    }
}
