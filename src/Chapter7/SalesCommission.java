package Chapter7;
import java.util.Scanner;
public class SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] salaryRange = new int[9];
        System.out.print("Enter the number of salespeople: ");
        int numberOfSalespeople = scanner.nextInt();

        double[] sales = new double[numberOfSalespeople];
        for(int i = 0; i < numberOfSalespeople; i++){
            System.out.print("Enter gross sales for Salespeople" +(i + 1) + ": $" );
            sales[i] = scanner.nextDouble();
        }

        for(int i = 0; i < numberOfSalespeople; i++){
            double salary = 200  + (0.09 * sales[i]);

            if(salary < 300){
                salaryRange[0]++;
            }
            else if (salary < 400) {
                salaryRange[1]++;
            } else if (salary < 500) {
                salaryRange[2]++;
            } else if (salary < 600) {
                salaryRange[3]++;
            } else if (salary < 700) {
                salaryRange[4]++;
            } else if (salary < 800) {
                salaryRange[5]++;
            } else if (salary < 900) {
                salaryRange[6]++;
            } else if (salary < 1000) {
                salaryRange[7]++;
            }
            else {
                salaryRange[8]++;
            }
        }
        System.out.println("Salary Range \t\t Number of Salespeople");
        System.out.println("------------------------------------------");
        System.out.println("$200-$299 \t\t\t\t " + salaryRange[0]);
        System.out.println("$300-$399 \t\t\t\t " + salaryRange[1]);
        System.out.println("$400-$499 \t\t\t\t " + salaryRange[2]);
        System.out.println("$500-$599 \t\t\t\t " + salaryRange[3]);
        System.out.println("$600-$699 \t\t\t\t " + salaryRange[4]);
        System.out.println("$700-$799 \t\t\t\t " + salaryRange[5]);
        System.out.println("$800-$899 \t\t\t\t " + salaryRange[6]);
        System.out.println("$900-$999 \t\t\t\t " + salaryRange[7]);
        System.out.println("$1000 and over \t\t\t " + salaryRange[8]);
    }

}
