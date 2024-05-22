package Chapter7b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Example2A {
    public static void main(String[] args) throws IOException {

        //Read 10 strings from the keyboard
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];

        for(int i = 0; i < list.length; i++){
            list[i] = reader.readLine();
        }
        System.out.println(Arrays.toString(list));

    }
}
