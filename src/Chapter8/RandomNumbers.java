package Chapter8;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        System.out.println("Enter a random Number: ");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Generated random numbers:");
        for(int i = 10; i <=100; i++){
            int randomNumber = 10 + random.nextInt(91);
            System.out.println(randomNumber);
        }
    }
}
