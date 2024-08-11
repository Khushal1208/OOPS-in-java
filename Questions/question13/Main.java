package OOPS.Questions.question13;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Product product1 = new Product("perleG",100);
        Product product2 = new Product("LED TV", 200);
        Product product3 = new Product("Mobile", 80);
        Product product4 = new Product("Tablet", 50);
        System.out.println("Add three products in inventory:");
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);
        System.out.println("\nCheck low inventory:");
        product2.setQuatity(140);
        inventory.checkInventory();
        System.out.println("\nRemove Tablet from the inventory!");
        inventory.removeProduct(product3);
        System.out.println("\nAgain check low inventory:");
        inventory.checkInventory();
    }
}
