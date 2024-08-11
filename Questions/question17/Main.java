package OOPS.Questions.question17;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("ATTACK","LakshayRaj",new ArrayList<String>(Arrays.asList("John", "rakulPreet","jaqueline")));
        Review review1 = new Review("Great movie!", "Irvine Rolf", 4.5);
        Review review2 = new Review("Highly recommended!", "Ashkii Karlheinz", 4.5);
        Review review3 = new Review("A classic that never gets old.", "Nele Athol", 4.0);
        Review review4 = new Review("Great movie!", "Cipactli Anselma", 4.0);
        Review review5 = new Review("Highly recommended!", "Martin Nadine", 4.0);

        movie1.addReview(review1);
        movie1.addReview(review2);
        movie1.addReview(review3);
        movie1.addReview(review4);
        movie1.addReview(review5);

        Movie movie2 = new Movie("The Godfather", "Francis Ford Coppola",
                new ArrayList < String > (Arrays.asList("Marlon Brando", "Al Pacino", "James Caan")));

        // display all the reviews for the movie
        System.out.println("\nReviews for '" + movie1.getTitle() + "':");
        for (Review review: movie1.getReviews()) {
            System.out.println(review.getReviewText() + " by " + review.getReviewerName() + " - " + review.getRating());
        }

        // add some reviews	for movie2
        movie2.addReview(review1);
        movie2.addReview(review4);
        movie2.addReview(review5);

        // display all the reviews for the movie
        System.out.println("\nReviews for '" + movie2.getTitle() + "':");
        for (Review review: movie2.getReviews()) {
            System.out.println(review.getReviewText() + " by " + review.getReviewerName() + " - " + review.getRating());
        }


    }
}
