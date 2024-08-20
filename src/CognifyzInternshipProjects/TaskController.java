package CognifyzInternshipProjects;

import java.util.Scanner;

public class TaskController {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        boolean running = true;
        while (running){
            System.out.println("1. Create the task");
            System.out.println("2. Read the task");
            System.out.println("3. Update the task");
            System.out.println("4. Delete the task");
            System.out.println("5. Exit");
            System.out.print("Enter your Option to perform task");

            int choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the Title of the task");
                    String title = input.next();
                    System.out.println("Enter the Description of task");
                    String description = input.next();
                    taskManager.createTasks(title, description);
                    break;
                case 2:
                    taskManager.readTasks();
                    break;
                case 3:
                    System.out.println("Update task");
                    String update = input.next();
                    System.out.println("");
            }
        }

    }
}