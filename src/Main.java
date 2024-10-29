import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of ToDo objects
        ArrayList<ToDo> tasks = new ArrayList<>();

        // Add some tasks
        tasks.add(new ToDo("Complete Java Homework", "High", LocalDateTime.of(2024, 10, 30, 17, 0)));
        tasks.add(new ToDo("Go to the Gym", "Medium", LocalDateTime.of(2024, 10, 29, 19, 0)));
        tasks.add(new ToDo("Buy Groceries", "Low", LocalDateTime.of(2024, 10, 29, 18, 30)));

        // Display all tasks
        System.out.println("To-Do List:");
        for (ToDo task : tasks) {
            System.out.println(task);
        }

        // Mark the first task as complete
        tasks.get(0).markAsComplete();
        tasks.remove(2);

        // Display updated tasks
        System.out.println("\nUpdated To-Do List:");
        for (ToDo task : tasks) {
            System.out.println(task);
        }
    }
}