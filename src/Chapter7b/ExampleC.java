package Chapter7b;
import java.util.Arrays;
public class ExampleC {
    public static void main(String[] args) {

        //10-element array with numbers from 0 to 9
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
