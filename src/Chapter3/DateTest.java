package Chapter3;
import java.util.Scanner;
public class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Month:");
        int month = input.nextInt();
        System.out.println("Enter the Day: ");
        int day = input.nextInt();
        System.out.println("Enter the Year: ");
        int year = input.nextInt();

        String displayDate = month + "/" + day + "/" + year;

        System.out.println("The Date is "+ displayDate);
    }
}
