package Chapter7b;
import java.util.Arrays;

public class ExampleD {
    public static void main(String[] args) {
        //10-element array with numbers from 9 to 0
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 9 - i;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
