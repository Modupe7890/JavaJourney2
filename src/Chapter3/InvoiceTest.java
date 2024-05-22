package Chapter3;
import java.util.Scanner;
public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Product Number: ");
        String partNumber = input.next();

        System.out.println("Enter Product Description: ");
        String partDescription = input.next();

        System.out.println("Enter quantity of Product Purchased: ");
        int quantityPurchased = input.nextInt();

        System.out.println("Enter the Price per Item:");
        double itemPerPrice = input.nextDouble();

        double InvoiceAmount = quantityPurchased * itemPerPrice;

        System.out.println("Product Number      Product Description     Quantity Purchased      " +
                "Price of  Item      Invoice Total"   );

        System.out.println(partNumber+ "                    "+partDescription+ "                       "+quantityPurchased+
                "                  "+itemPerPrice+ "             "+InvoiceAmount);






    }
}
