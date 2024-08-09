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
        System.out.println("5.) How many stripes are there on the US flag?");

        // Array of corresponding answers to the quiz questions
        String[][] options = {
                {"a) 0", "b) 1", "c) 2", "d) 3"},
                {"a) 16", "b) 8", "c) 11", "d) 4"},
                {"a) Paris", "b) London", "c) Rome", "d) Berlin"},
                {"a) 365", "b) 367", "c) 366", "d) 400"},
                {"a) 23", "b) 13", "c) 12", "d) 10"},
        };
        //Array of correct answers
        char[] answers = {'c', 'c', 'a', 'a', 'b'};

        int score = 0;
        for (int i = 0; i < args.length; i++) {
            System.out.println(i);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Choose the correct option (a/b/c/d): ");
            char userAnswer = scanner.next().toLowerCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was " + answers[i] + ".\n");
            }
        }
    }
}
