package OOPS.AbstractClasses.question6;

public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        System.out.println("Volume and surface area of sphere :");
        System.out.println(sphere.calculateVolume()+" and "+sphere.calculateSurfaceArea());
        Cube cube = new Cube(3);
        System.out.println("\nVolume and surface area of Cube :");
        System.out.println(cube.calculateVolume()+" and "+cube.calculateSurfaceArea());
    }
}
