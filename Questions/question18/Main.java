package OOPS.Questions.question18;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        // Create menu items
        MenuItems item1 = new MenuItems("Paneer", 180);
        MenuItems item2 = new MenuItems("Kadi", 100);
        MenuItems item3 = new MenuItems("Roti", 10);
        MenuItems item4 = new MenuItems("Chai", 10);
        MenuItems item5 = new MenuItems("Thali", 120);

        // Add menu items to the restaurant
        restaurant.addItem(item1);
        restaurant.addItem(item2);
        restaurant.addItem(item3);
        restaurant.addItem(item4);
        restaurant.addItem(item5);

        // Add some ratings to the items
        item1.addRating(4);
        item1.addRating(5);
        item2.addRating(3);
        item2.addRating(4);
        item3.addRating(5);
        item4.addRating(4);
        item4.addRating(4);
        item5.addRating(5);
        item1.addRating(1);
        item2.addRating(3);
        item5.addRating(2);

        // Display the menu
        System.out.println("Menu: Item & Price & Ratings");
        restaurant.displayMenu();

        restaurant.removeItem(item3);
        restaurant.removeItem(item5);

        System.out.println("Menu: Item & Price & Ratings");
        restaurant.displayMenu();
    }
}
