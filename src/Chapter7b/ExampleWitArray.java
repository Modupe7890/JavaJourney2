package Chapter7b;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ExampleWitArray {
    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        //Read strings from keyboard
        String[] list = new String[10];
        for(int i = 0; i < list.length; i++){
            String s = reader.readLine();
            list[i] = s;
        }
        // Display the content of the array
        for(int i = 0; i < list.length; i++){
            int j = list.length - i - 1;
            System.out.println(list[j]);
        }
    }
}
