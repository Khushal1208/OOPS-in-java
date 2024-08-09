package OOPS.Interfaces.question3;

public class FlyableFactory {
    public static Flyable getFlyable(String type){
        return switch (type.toLowerCase()) {
            case "spacecraft" -> new Spacecraft();
            case "airplane" -> new Airplane();
            case "helicopter" -> new Helicopter();
            default -> null;
        };
    }
}
