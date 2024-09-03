package Task5;

import CognifyzInternshipProjects.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<CognifyzInternshipProjects.Task> tasks = new ArrayList<>();


    public void createTasks(String title, String description) {
        CognifyzInternshipProjects.Task newTask = new CognifyzInternshipProjects.Task(tasks.size()+1, title, description);
        tasks.add(newTask);
        System.out.println("Task created successfully!");
    }
    public void readTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (CognifyzInternshipProjects.Task task : tasks) {
                System.out.println(task);
            }
        }
    }
    public void updateTasks(int id, String newTitle, String newDescription) {
        for (CognifyzInternshipProjects.Task task : tasks) {
            if (task.getId() == id) {
                task.setTitle(newTitle);
                task.setDescription(newDescription);
                System.out.println("Task updated successfully!");
                return;
            }
        }
        System.out.println("Task not found.");
    }
    public void deleteTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                tasks.remove(task);
                System.out.println("Task deleted successfully!");
                return;
            }
        }
        System.out.println("Task not found.");
    }
}

