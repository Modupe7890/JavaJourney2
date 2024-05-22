package Chapter7b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class ExampleWitArrayList {
    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        //Read Strings from the keyboard


        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < 10; i++){
            String s = reader.readLine();
            list.add(s);
        }
        // Display the content of the array
        for (int i = 0; i < list.size(); i++) {
            int j = list.size() - i - 1;
            System.out.println(list.get(j));
        }
    }
}
