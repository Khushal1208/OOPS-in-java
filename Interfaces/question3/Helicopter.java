package OOPS.Interfaces.question3;

public class Helicopter implements Flyable{
    @Override
    public void fly_obj() {
        System.out.println("Helipcopter are also flies in sky .");
    }
    @Override
    public String description() {
        return "these are built for traveling in remote areas where airplanes cant fly and land , " +
                "they are specially  used in recue purpose.";
    }
}