package OOPS.Questions.question17;

import java.util.ArrayList;

//Write a Java program to create a class called "Movie" with attributes for title,
//director, actors, and reviews, and methods for adding and retrieving reviews.
public class Movie {
    private String title, director ;
    private ArrayList<String> actors ;
    private ArrayList<Review> reviews;

    public Movie(String title, String director, ArrayList<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList<Review>();
    }
    public void addReview(Review review){
        reviews.add(review);
    }
    public void removeReview(Review review){
        reviews.remove(review);
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public ArrayList<String> getActors() {
        return actors;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }
}
