package OOPS.Interfaces.question8;

public class Main {
    public static void main(String[] args) {
        Playable football = new Football();
        Playable basketball = new Basketball();
        Playable volleyball = new Volleyball();
        football.play();
        basketball.play();
        volleyball.play();
    }
}
