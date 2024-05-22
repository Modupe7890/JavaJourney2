package Chapter4;
import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mileDriven;
        double gallonUsed;
        int tripCounter = 0;

        System.out.println("Enter number of miles Driven: ");
        mileDriven = input.nextDouble();

        System.out.println("Enter the number of gallon used per mile: ");
        gallonUsed = input.nextDouble();

        double mileage = mileDriven / gallonUsed ;
        System.out.println("The gas mileage is:  "+ mileage);

    }
}
