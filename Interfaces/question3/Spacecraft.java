package OOPS.Interfaces.question3;

public class Spacecraft implements Flyable{
    @Override
    public String description() {
        return "This is designed for space travel and eploration purposes.";
    }

    @Override
    public void fly_obj() {
        System.out.println("Space craft flies in the space.");
    }
}
