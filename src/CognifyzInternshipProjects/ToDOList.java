package CognifyzInternshipProjects;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDOList {
    private ArrayList<String> tasks;
    private Scanner scanner;

    public ToDOList(){
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    private void run(){
        boolean running = true;
        while (running);
        System.out.println("\n----------------To Do List----------------\n");
        System.out.println("1. Add Task");
        System.out.println("2. Delete Task");
        System.out.println("3. View all task");
        System.out.println("4. Quit");

    }
}
