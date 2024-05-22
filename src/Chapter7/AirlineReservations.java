package Chapter7;
import java.util.Scanner;
public class AirlineReservations {

    static boolean[] planeSeats = new boolean[11];
    static Scanner input = new Scanner(System.in);

    public static void firstClassChoice(){
        for(int seatNumber = 1; seatNumber < 5; seatNumber++){
            if (!planeSeats[seatNumber]) {
                System.out.println("Your seat Number is " +seatNumber + "\n First Class");
                planeSeats[seatNumber] = true;
                break;
            }
        }
    }
    public  static void economyChoice(){
        for(int seatNumber = 6; seatNumber < 10; seatNumber++){
            if (!planeSeats[seatNumber]) {
                System.out.println("Your seat Number is " +seatNumber + "\n Economy");
                planeSeats[seatNumber] = true;
                break;
            }
        }
    }
    public static void alternativePlacementForFirstClass(){
        System.out.println("Do you mind being placed in the economy section?");
        System.out.println("Enter 1 for yes" + "\n2 for No");

        int userSecondChoice = input.nextInt();
        if(userSecondChoice == 1){
            System.out.println("Next flight leaves in 3hours ");
        } else if (userSecondChoice ==2){
            economyChoice();
        } else {
            System.out.println("Wrong Input");
        }
    }
    public static void alternativePlacementForEconomy(){
        System.out.println("Do you mind being placed in the First class section?");
        System.out.println("Enter 1 for yes" + "\n2 for No");

        int userSecondChoice = input.nextInt();
        if(userSecondChoice == 1){
            System.out.println("Next flight leaves in 3hours ");
        } else if (userSecondChoice ==2){
            firstClassChoice();
        } else {
            System.out.println("Wrong Input");
        }
    }

    public static void main(String[] args) {
        System.out.println("Please Type 1 for First Class or Type 2 for Economy");
        int userInput = input.nextInt();
        if(userInput == 1){
            firstClassChoice();
        }
        else if(userInput == 2){
                economyChoice();
        }
            if(planeSeats[1] && planeSeats[2] && planeSeats[3] && planeSeats[4] && planeSeats[5]) {
                alternativePlacementForFirstClass();
            }
            if(planeSeats[6] && planeSeats[7] && planeSeats[8] && planeSeats[9] && planeSeats[10]) {
                alternativePlacementForEconomy();
            }
    }
}
