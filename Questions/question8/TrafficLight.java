package OOPS.Questions.question8;
// Write a Java program to create class called "TrafficLight" with attributes for color
// and duration, and methods to change the color and check for red or green
public class TrafficLight {
    private String color;
    private int duration ;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }
    public String getColor() {
        return color;
    }
    public void changeColor(String color){
        this.color = color;
    }
    public boolean isRed(){
        return  color.equals("red");
    }
    public boolean isGreen(){
        return  color.equals("green");
    }
    public boolean isYellow(){
        return  color.equals("yellow");
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
