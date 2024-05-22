package Chapter7b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Example2B {
    public static void main(String[] args) throws IOException {

        //Read 10 numbers from the keyboard
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++)
        {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
            System.out.println(Arrays.toString(list));
        }
    }
}
