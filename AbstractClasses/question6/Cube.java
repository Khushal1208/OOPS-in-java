package OOPS.AbstractClasses.question6;

public class Cube extends Shape3D{
    private int side;

    public Cube(int side) {
        this.side = side;
    }

    @Override
    public double calculateVolume() {
        return side*side*side;
    }

    @Override
    public double calculateSurfaceArea() {
        return 6*side*side;
    }
}
