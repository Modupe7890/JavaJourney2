
package Chapter3;
import java.util.Scanner;
public class HeartRateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Patient's First Name Here: ");
        String firstName = input.nextLine();
        System.out.println("Enter Patient's Last Name Here:   ");
        String lastName = input.next();

        System.out.println("Enter the Patient's month of Birth: ");
        int month = input.nextInt();
        System.out.println("Enter the Patient's day of Birth: ");
        int day = input.nextInt();
        System.out.println("Enter the Patient's Year of birth" );
        int year = input.nextInt();

        String dateOfBirth = month + "/" + day + "/" + year;

        int calculateAge = 2023 - year;

        int maxHeartRate = 220 - calculateAge;
        double targetHeartRate = maxHeartRate * 0.5;

        System.out.println();
        System.out.printf("Patient's Names " +firstName  +lastName);
        System.out.println("Patient's DOB " +dateOfBirth);
        System.out.println("Patient's Age " +calculateAge);

        System.out.println("Maximum Heart Rate is " +maxHeartRate);
        System.out.println("Targeted Heart Rate is " +targetHeartRate);




    }
}
