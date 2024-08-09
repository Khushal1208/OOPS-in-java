package OOPS.Interfaces.question9;

public class Main {
    public static void main(String[] args) {
        Searchable document = new Document("gfg = Geeks for Geeks.");
        System.out.println("Is Document contains 'for': "+document.search("for"));

        Searchable webpage = new WebPage("youtube is king","www.youtube.com");
        System.out.println("Is youtube webpage contains 'King': "+webpage.search("king"));

    }
}
