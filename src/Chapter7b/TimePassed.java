package Chapter7b;

import Chapter3.Date;

public class TimePassed {
    public static void main(String[] args) {

        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int minutes = currentTime.getMinutes();
        int seconds = currentTime.getSeconds();

        System.out.println("Time since Midnight "+hours+ ":" +minutes+ ":" +seconds);
        System.out.println("Time since Midnight "+hours+ ":" +minutes+ ":" +seconds);
        System.out.println("Time since Midnight "+hours+ ":" +minutes+ ":" +seconds);
        System.out.println("Time since Midnight "+hours+ ":" +minutes+ ":" +seconds);
        System.out.println("Time since Midnight "+hours+ ":" +minutes+ ":" +seconds);
        System.out.println("Time since Midnight "+hours+ ":" +minutes+ ":" +seconds);
        System.out.println("Time since Midnight "+hours+ ":" +minutes+ ":" +seconds);
    }
}
