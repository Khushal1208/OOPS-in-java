package OOPS.Questions.question18;

import java.util.ArrayList;

public class MenuItems {
    private  String itemName;
    private  ArrayList<Integer> ratings;
    private static int price;

    public MenuItems(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
        this.ratings = new ArrayList<Integer>();
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }

    public ArrayList<Integer>  getRating() {
        return ratings;
    }
    public void addRating(Integer rating){
         ratings.add(rating);
    }
    public float calculateAverageRating() {
        if (ratings.isEmpty()) {
            // If there are no ratings, return 0 or you can handle it differently
            return 0;
        }

        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }

        // Calculate the average
        float average = (float) sum / ratings.size();
        return average;
    }
    public  void displayMenu(){
        System.out.println("    "+itemName + "    "+price+"  Total rating: "+ratings.size()+ "    Average Rating: "+calculateAverageRating());
    }
}
