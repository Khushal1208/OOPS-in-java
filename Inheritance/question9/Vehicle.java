package OOPS.Inheritance.question9;
// Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle,with subclasses
// Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type.
// Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.
public abstract class Vehicle {
    private String make, model,feulType;
    private int year;
    private double fuelEfficiency;

    public Vehicle(String make, String model,int year, String feulType,double fuelEfficiency) {
        this.make = make;
        this.model = model;
        this.feulType = feulType;
        this.year = year;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getFeulType() {
        return feulType;
    }

    public int getYear() {
        return year;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }
    public abstract double calculateFuelEfficiency();
    public abstract double calculateDistanceTravelled();
    public abstract double getmaxSpeed();
}
