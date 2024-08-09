package CognifyzInternshipProjects;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //quiz questions
        System.out.println("1.) What is the smallest prime number?");
        System.out.println("2.) How many time zones are there in Russia?");
        System.out.println("3.) What is the capital of France?");
        System.out.println("4.) How many days does it take for the Earth to orbit the Sun?");
        System.out.println("5.) How many stripes are there on the US flag? (13)");

        // Array of corresponding answers to the quiz questions
        String[][] options = {
                {"a) 0", "b) 1", "c) 2", "d) 3"},
                {"a) 16", "b) 8", "c) 11", "d) 4"},
                {"a) Earth", "b) Mars", "c) Jupiter", "d) Saturn"},
                {"a) 365", "b) 367", "c) 366", "d) 400"},
                {"a) 23", "b) 13", "c) 12", "d) 10"},
        };
    }
}
