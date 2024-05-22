package Chapter5;

public class SumOdd {
    public static void main(String[] args) {

        int sum = 0;
        for (int counter = 1; counter <= 99; counter +=2) {

            sum += counter;

            System.out.printf("Sum is %d%n", sum);
        }
    }
}
