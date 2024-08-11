package OOPS.Questions.question18;

import java.util.ArrayList;

//Write a Java program to create a class called "Restaurant" with attributes for menu items, prices,
//and ratings, and methods to add and remove items, and to calculate average rating.
public class Restaurant {
    private ArrayList<MenuItems> menuItems ;

    public ArrayList<MenuItems> getMenuItems() {
        return menuItems;
    }

    public Restaurant(){
        this.menuItems = new ArrayList<MenuItems>();
    }

    public ArrayList<MenuItems> getItmes() {
        return menuItems;
    }
    public void addItem(MenuItems item){
        menuItems.add(item);
    }
    public void removeItem(MenuItems item){
        menuItems.remove(item);
    }
    public void displayMenu(){
        if(menuItems.isEmpty()){
            System.out.println("No items are Available ");
        }
        else {
            for(MenuItems items : menuItems){
                items.displayMenu();
            }
        }
    }
}
