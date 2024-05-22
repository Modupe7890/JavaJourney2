package Chapter2;
import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 2;
        int y = 3;

        System.out.printf("x = %d%n", x);
        System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));
        System.out.printf("x =");
        System.out.printf("%d = %d%n", (x + y), (y + x));
    }
}
