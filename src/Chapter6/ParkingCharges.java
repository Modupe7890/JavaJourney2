package Chapter6;
import java.util.Scanner;
public class ParkingCharges {

    public static double calculateCharges(int hours) {

        double charges  = 0.0;

        if((hours >= 1)&&(hours <=3)){
            charges = 2.0;
        }
        else if((hours >3)&&(hours < 19)) {
            charges = ((hours - 3) * 0.5)+ 2.0;
        }
        else if(hours > 19) {
            charges = 10.0;
        }

        return charges;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the parking Space!");
        System.out.println();


        int count =1;
        double totalCharges = 0;

        for(int d= 1; d <= count; d++) {

            System.out.println("Enter total number of hours used in the park: ");
            int hoursParked = input.nextInt();

            System.out.printf("Customer charge is: %.2f%n", calculateCharges(hoursParked));
            totalCharges += calculateCharges(hoursParked);

        }

    }
}
