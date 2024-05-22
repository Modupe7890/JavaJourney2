package Chapter4;
import java.util.Scanner;
public class IdentifyErrorAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        System.out.println("Enter the Age: ");
        age = input.nextInt();

        if (age >= 65) {
            System.out.println("Age is greater than or equal to 65");
        }
    else {
            System.out.println("Age is less than 65");
        }
    }
}
