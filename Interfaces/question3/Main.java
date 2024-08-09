package OOPS.Interfaces.question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Flyable Simulator!");
        System.out.println("Choose a flying object (spacecraft, airplane, helicopter,0 to stop choices): ");
        while (true){
            String choice = s.nextLine();
            if(choice.equals("0")){
                System.out.println("Exiting the simulator , Goodbye!");
                break;
            }

            Flyable flyingObject = FlyableFactory.getFlyable(choice);
//             it is similar to int object = Math.sqrt(num);
//             flyingObject is Flyable type because when "FlyableFactory.getFlyable(choice);" called
//             then will return Constructor of Flyable type according to choice.

            if (flyingObject != null) {
                System.out.println("Description: " + flyingObject.description());
                flyingObject.fly_obj();
            } else {
                System.out.println("Invalid choice. Please choose either (spacecraft, airplane, helicopter,0 to stop choices): ");
            }

        }
        s.close();

    }
}
