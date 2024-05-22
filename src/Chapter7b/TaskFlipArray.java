package Chapter7b;

import java.io.IOException;
import java.util.Arrays;

public class TaskFlipArray {
    public static void main(String[] args) throws IOException {

        // An array of 10 numbers in reverse order
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = 10 - i;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
