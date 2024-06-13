package Chapter7b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class TaskReverse {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = 10 - i;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers));
    }
}
