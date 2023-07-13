package day06.practice;

/*
 * Question#2: Create an ArrayList<Task> store the  task details
 * 
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class Task {
	public String taskName;

	public int priority;

	public Task(String taskName, int priority) {
		this.taskName = taskName;
		this.priority = priority;
	}

	public static void main(String[] args) {

		ArrayList<Task> taskList = new ArrayList<>();
		taskList.add(new Task("Taskplay", 3));
		taskList.add(new Task("Taskeating", 2));
		taskList.add(new Task("Taskstudying", 1));
		taskList.add(new Task("Tasktakingnotes", 4));
		taskList.add(new Task("Taskexercise", 5));

		for (Task task : taskList) {
			System.out.println("TaskName " + task.taskName);
			System.out.println("Taskpriority " + task.priority);

			System.out.println();

		}

	}
}
