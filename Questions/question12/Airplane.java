package OOPS.Questions.question12;

import java.time.LocalTime;

//Write a Java program to create a class called "Airplane" with a flight number, destination,
//and departure time attributes, and methods to check flight status and delay.
public class Airplane {
    private String flightNum,destination ;
    private LocalTime departTime;
    private int timeDelay;

    public Airplane(String flightNum, String destination, LocalTime departTime) {
        this.flightNum = flightNum;
        this.destination = destination;
        this.departTime = departTime;
        this.timeDelay = 0;
    }
    public int getTimeDelay() {
        return timeDelay;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalTime getDepartTime() {
        return departTime;
    }

    public void setDepartTime(LocalTime departTime) {
        this.departTime = departTime;
    }

    public void delay(int minutes){
        this.timeDelay = minutes;
        this.departTime = this.departTime.plusMinutes(minutes);
    }
    public void checkStatus(){
        if(timeDelay == 0){
            System.out.println("flight "+flightNum+" is on time ");
        }
        else{
            System.out.println("flight "+flightNum+"is delayed by "+timeDelay+" minutes  ");
        }
    }


}
