package OOPS.Interfaces.question5;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(13,43);
        System.out.println("Rectangle size");
        System.out.println("Width = "+rectangle.getWidth());
        System.out.println("Height = "+rectangle.getHeight());

        rectangle.resizeHeight(21);
        rectangle.resizeWidth(54);

        System.out.println("\nAfter Resizing Rectangle size are");
        System.out.println("Width = "+rectangle.getWidth());
        System.out.println("Height = "+rectangle.getHeight());

    }
}
