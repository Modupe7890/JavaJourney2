package Chapter6;
import java.util.Scanner;
public class SeparatingDigit {

    public static int calQuotient(int a, int b){
        return a / b;
    }
    public static int calRemainder(int a, int b){
        return a % b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first value: ");
        int a = input.nextInt();

        System.out.println("Enter the second value: ");
        int b = input.nextInt();

        int quotient = calQuotient(a,b);
        System.out.printf("Answer to the Quotient " + quotient);

        System.out.println();

        int remainder = calRemainder(a,b);
        System.out.printf("Answer to the Remainder " + remainder);
    }
}
