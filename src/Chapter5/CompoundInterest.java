package Chapter5;
import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        int principal;
        double rate;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Principal amount: ");
        principal = input.nextInt();
        System.out.println("Enter the rate: ");
        rate = input.nextInt();

        System.out.printf("%s%20s%n", "Year", "Principal Amount");

        for (int year = 1; year <= 10; ++year){

        double calculateCompoundInterest = principal * Math.pow(1 + rate, year) - principal;


            System.out.printf("%4d%,20.2f%n", year, calculateCompoundInterest);

        }

    }
}
