package OOPS.Inheritance.question9;

public class MotorCycle extends Vehicle{
    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    private double engineDisplacement;

    public MotorCycle(String make, String model, int year, String feulType, double fuelEfficiency, double engineDisplacement) {
        super(make, model, year, feulType, fuelEfficiency);
        this.engineDisplacement = engineDisplacement;
    }
    @Override
    public double calculateFuelEfficiency() {
        return getFuelEfficiency()*(1.0 / (1.0 + (getEngineDisplacement() / 1000.0)));
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
