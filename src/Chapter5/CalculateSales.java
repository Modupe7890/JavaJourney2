package Chapter5;
import java.util.Scanner;
public class CalculateSales {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double totalRetailAmount = 0;

            // Display the product list
            System.out.println("Product List:");
            System.out.println("1. $2.98");
            System.out.println("2. $4.50");
            System.out.println("3. $9.98");
            System.out.println("4. $4.49");
            System.out.println("5. $6.87");

            // Sentinel-controlled loop to read product number and quantity sold
            while (true) {
                System.out.print("Enter product number (1-5) or -1 to exit: ");
                int productNumber = input.nextInt();

                if (productNumber == -1) {
                    break; // Exit the loop if -1 is entered
                }

                System.out.print("Enter quantity sold: ");
                int quantitySold = input.nextInt();

                // Calculate retail value based on product number using a switch statement
                double retailPrice;
                switch (productNumber) {
                    case 1:
                        retailPrice = 2.98;
                        break;
                    case 2:
                        retailPrice = 4.50;
                        break;
                    case 3:
                        retailPrice = 9.98;
                        break;
                    case 4:
                        retailPrice = 4.49;
                        break;
                    case 5:
                        retailPrice = 6.87;
                        break;
                    default:
                        System.out.println("Invalid product number. Please enter a number between 1 and 5.");
                        continue; // Continue to the next iteration of the loop
                }

                // Calculate and accumulate the total retail value
                double productTotal = retailPrice * quantitySold;
                totalRetailAmount += productTotal;

                System.out.println("Retail value for product " + productNumber + " = $" + productTotal);
            }

            // Display the total retail value of all products sold
            System.out.println("Total retail value of all products sold: $" + totalRetailAmount);

    }
}
