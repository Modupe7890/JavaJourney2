package Chapter7b;

import java.io.IOException;
import java.util.Date;

public class CurrentDate {
    public static void main(String[] args) throws IOException {
        Date today = new Date();
        System.out.println("Current date: " + today);
    }
}
