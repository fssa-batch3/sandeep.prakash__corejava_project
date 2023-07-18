package day09.practice;

import java.util.*;
import java.util.Scanner;

public class SortingUser {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a how may number should be");

		int n = scan.nextInt();
		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.println("Enter a the number should be");

		for (int i = 0; i < n; i++) {
			int input = scan.nextInt();
			arrayList.add(input);
		}

		List<Integer> list = sortNumber(arrayList);
		System.out.print("Sorted list: ");
		String data = "";
		for (int number : list) {
			data += number + " ";

		}

		System.out.print(data);
	}

	public static List<Integer> sortNumber(ArrayList<Integer> arrayList) {
		Collections.sort(arrayList);
		return arrayList;

	}
}
