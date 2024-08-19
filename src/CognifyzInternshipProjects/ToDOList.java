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
        int choice = scanner(System.in);
        scanner.nextLine();

        switch (choice){
            case 1:
                addTask;
                break;
            case 2:
                deleteTask;
                break;
            case 3:
                displayTask;
                break;
            case 4:
                running = false;
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
    private void addTask() {
        System.out.print("\nEnter Task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully");
    }
    private void deleteTask() {
        System.out.println("Enter task number to delete");
        int taskNum = scanner.nextInt();
        scanner.nextLine();
        if (taskNum > 0 && taskNum <= tasks.size()) {
            tasks.remove(taskNum - 1);
            System.out.println("Task deleted successfully");
        } else {
            System.out.println("Invalid Task number");

        }
    }
    private void displayTask(){
        if(tasks.isEmpty()){
        System.out.println("No task to display");
    }else{
            for(int i = 0; i < tasks.size(); i++){
                System.out.println(i+1) ","  tasks.get(i);
            }
        }
    }
}

