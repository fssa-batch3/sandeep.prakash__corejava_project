package day07.practice;

import java.time.LocalDate;
/*
 * Question#2: Create a ArrayList<Task> of Task with tasks having the same name and deadline. 
 * Use an HashSet<Task> to remove duplicate Task
 */
import java.util.ArrayList;
import java.util.HashSet;

public class TaskDuplicate {

	private int id;
	private String name;
	private LocalDate deadline;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	public TaskDuplicate(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}
	
    @Override
    public String toString() {
        return "TaskDuplicate [id=" + id + ", name=" + name + ", deadline=" + deadline + "]";
    }

	public static void main(String[] args) {

		ArrayList<TaskDuplicate> taskList = new ArrayList<>();

		TaskDuplicate t1 = new TaskDuplicate(1, "taskplay", LocalDate.of(2023, 7, 15));
		taskList.add(t1);
		taskList.add(t1);
		taskList.add(new TaskDuplicate(2, "taseat", LocalDate.of(2023, 7, 15)));
		taskList.add(new TaskDuplicate(3, "tasklearn", LocalDate.of(2023, 7, 17)));

		System.out.println(taskList);

		taskRemoveDuplicate(taskList);

	}

	public static void taskRemoveDuplicate(ArrayList<TaskDuplicate> taskList) {
		HashSet<TaskDuplicate> uniqueArr = new HashSet<TaskDuplicate>(taskList);
		System.out.println(uniqueArr);

	}
}
