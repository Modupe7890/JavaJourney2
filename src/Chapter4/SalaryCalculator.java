package Chapter4;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {

        int hourWorked;
        int hourlyRate;
        double extraHour;
        double grossPay;
        double CalculateGrossPay =0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first Employee's number of hours you worked in a week: ");
        hourWorked = input.nextInt();

        System.out.println("Enter the second Employee's number of hours you worked in a week: ");
        input.nextInt();

        System.out.println("Enter the third Employee's number of hours you worked in a week: ");
        input.nextInt();

        System.out.println("Enter first Employee's hourly rate: ");
        hourlyRate = input.nextInt();
        System.out.println("Enter second Employee's hourly rate: ");
        input.nextInt();
        System.out.println("Enter third Employee's hourly rate: ");
        input.nextInt();

        grossPay = hourWorked * hourlyRate;

        if (hourWorked > 40){
            extraHour = hourWorked - 40;

            CalculateGrossPay = (grossPay + (extraHour / 2) + 40) * hourlyRate;
        }
        System.out.println("GrossPay for First Employee " +CalculateGrossPay);
        System.out.println("GrossPay for Second Employee " +CalculateGrossPay);
        System.out.println("GrossPay for Third Employee " +CalculateGrossPay);

    }






}
