package Chapter4;
import java.util.Scanner;
public class TwoLargestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int counter = 1;
        int firstLargest = 0;
        int secondLargest =0;
        System.out.println("Enter ten numbers:");
        number = input.nextInt();

        while (counter <= 10) {
           if (number > firstLargest){
               firstLargest = number;
           }
           else
               if(number > secondLargest) {
                    secondLargest = number;
            }
               counter ++;
            System.out.printf("The largest number is: %d%n", firstLargest);
            System.out.printf("The second largest number is: %d%n", secondLargest);
        }
    }
}
