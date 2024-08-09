package OOPS.AbstractClasses.question6;

public class Sphere extends Shape3D{
    private int r;

    public Sphere(int r) {
        this.r = r;
    }

    @Override
    public double calculateVolume() {
        return (4/3) * Math.PI * r*r*r;
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * r*r;
    }
}
