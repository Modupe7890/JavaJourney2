package Chapter3;
import java.util.Scanner;
public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ensure you enter a correct detail for accurate Health Profile Result");
        System.out.println("--------------------------------------------------------------------");

        System.out.println("Enter Your First Name: ");
        String firstName = input.nextLine();
        System.out.println("Enter Your Second Name: ");
        String lastName = input.nextLine();
        System.out.println("What is your Gender: ");
        String gender = input.nextLine();
        System.out.println("Enter Your Birth Month: ");
        int month = input.nextInt();
        System.out.println("Enter your Birth Day: ");
        int day = input.nextInt();
        System.out.println("Enter your Birth Year: ");
        int year = input.nextInt();
        System.out.println("Enter your Height in Inches: ");
        int height = input.nextInt();
        System.out.println("Enter your Weight in Kg: ");
        double weight = input.nextDouble();

        String dateOfBirth = month + "/" + day + "/" + year;
        int calculateAge = 2023 - year;
        weight =  weight * 2.205;
        double bodyMassIndex = ((weight / height * height));
        int maxHeartRate = 220 - calculateAge;
        double targetHeartRate = maxHeartRate * 0.5;

        System.out.println();
        System.out.println("First name "+firstName);
        System.out.println("Last name "+lastName);
        System.out.println("Gender is "+gender);
        System.out.println("Date of Birth " +dateOfBirth);
        System.out.println("Age "+calculateAge);
        System.out.println("BMI is "+bodyMassIndex);
        System.out.println("Maximum Heart Rate "+maxHeartRate);
        System.out.println("Targeted Heart Rate "+targetHeartRate);
    }
}
