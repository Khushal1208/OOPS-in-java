package OOPS.Interfaces.question3;

public class Airplane implements Flyable{
    @Override
    public void fly_obj() {
        System.out.println("Airplanes are flies in the sky. ");
    }
    @Override
    public String description() {
        return "These are meant for faster traveling around the world ,it flies around 15000 feet up in the sky.";
    }
}