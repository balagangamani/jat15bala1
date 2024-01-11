package Controlsystem;

import java.util.Scanner;

public class Answer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the student's mark: "); // Input student's marks
		int mark = sc.nextInt();

		if (mark > 100 || mark < 0) {
			System.out.println("Invalid Input");
		} else {
			System.out.println("The grade is: " + getGrade(mark)); // Based on the marks input, grade is printed
		}

	}

	public static String getGrade(int mark) {
		if (mark == 100) {
			return "S"; // If the marks are equal to 100, then 'S' grade is printed
		} else if (mark >= 90) {
			return "A"; // If the marks are >= 90, then 'A' grade is printed
		} else if (mark >= 80) {
			return "B"; // If the marks are >= 80, then 'B' grade is printed
		} else if (mark >= 70) {
			return "C"; // If the marks are >= 70, then 'C' grade is printed
		} else if (mark >= 60) {
			return "D"; // If the marks are >= 60, then 'D' grade is printed
		} else if (mark >= 50) {
			return "E"; // If the marks are >= 50, then 'E' grade is printed
		} else {
			return "F"; // If the marks are less than 50, then 'F' grade is printed
		}
	}
}
