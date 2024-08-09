package OOPS.Inheritance.question9;

public class Main {
    public static void main(String[] args) {

// Create instances of each vehicle type
        Truck truck = new Truck("Tatra", "Tatra 810 4x4", 2020, "GASOLINE", 8.112, 4.5);
        Car car = new Car("Volkswagen", "Virtus", 2019, "HYBRID", 6.123, 8);
        MotorCycle motorcycle = new MotorCycle("Massimo Motor", "Warrior200", 2018, "GASOLINE", 2.1,23.3);

// Print the vehicle details and calculations
        System.out.println("Truck Model: " + truck.getModel());
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + truck.calculateDistanceTravelled() + " miles");
        System.out.println("Max Speed: " + truck.getmaxSpeed() + " mph\n");

        System.out.println("Car Model: " + car.getModel());
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + car.calculateDistanceTravelled() + " miles");
        System.out.println("Max Speed: " + car.getmaxSpeed() + " mph\n");

        System.out.println("Motorcycle Model: " + motorcycle.getModel());
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + motorcycle.calculateDistanceTravelled() + " miles");
        System.out.println("Max Speed: " + motorcycle.getmaxSpeed() + " mph");
    }
}