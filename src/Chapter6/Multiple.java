package Chapter6;
import java.util.Scanner;
public class Multiple {

    public static boolean Multiple(int first, int second) {
        return second % first == 0;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        while (true){
            System.out.print("Enter the first Integer (or 0 to exit): " );
            int first = input.nextInt();

            if (first ==0){
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
            System.out.print("Enter the second number ");
            int second = input.nextInt();

            if (Multiple(first, second)) {
                System.out.println(second + " is a multiple of " + first);
            }
            else {
                System.out.println(second + " is not a multiple of " + first);
            }
        }
    }
}
