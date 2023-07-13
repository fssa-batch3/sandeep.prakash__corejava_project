package day06.practice;

import java.util.ArrayList;

public class TaskMethod {

	public static void main(String[] args) {
		ArrayList<Task> taskList = new ArrayList<>();
		taskList.add(new Task("Taskplay", 3));
		taskList.add(new Task("Taskeating", 2));
		taskList.add(new Task("Taskstudying", 1));
		taskList.add(new Task("Tasktakingnotes", 4));
		taskList.add(new Task("Taskexercise", 5));

		boolean findTask = findTaskByName("Taskplay", taskList);
		System.out.println("Task " + findTask);
	}

	public static boolean findTaskByName(String name, ArrayList<Task> tasks) {
		for (Task task : tasks) {
			if (task.taskName.equals(name)) {
				return true;

			}
		}
		return false;

	}

}
