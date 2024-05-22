package Chapter5;
import java.util.Scanner;
public class IntegerEvenOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n %s%n %s%n", "Enter a value: ",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");

        while (input.hasNext()){
            int value = input.nextInt();
            value ++;


            switch (value % 2) {
                case 0:
                    System.out.println("Even integer");
                case 1:
            }    }        System.out.println("Odd integer");
    }
}
