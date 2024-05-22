package Chapter7;
import java.util.Scanner;
public class TotalSales {
    public static void main(String[] args) {
        int[][] sales = new int[4][5];

        Scanner input = new Scanner(System.in);
        int salesPerson;
        int productNumber;
        int productValue = 0;

        for(salesPerson = input.nextInt(); salesPerson < sales.length; salesPerson++) {
            for (productNumber = input.nextInt(); productNumber < sales[salesPerson].length; productNumber++) {
                sales[salesPerson][productNumber] += productValue;
            }
        }
    }
}
