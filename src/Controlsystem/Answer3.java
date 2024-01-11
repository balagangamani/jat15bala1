package Controlsystem;

import java.util.Scanner;

public class Answer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		// Call the function to print the pattern
		printPattern(n);
	}

	public static void printPattern(int n) {
		int num = 1; // Number to start printing from

		// Loop for each row
		for (int i = 1; i <= n; i++) {
			// Loop for each column in the row
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++; // Increment number after printing
			}
			// Move to the next line after each row
			System.out.println();

			// If the input number is '4', then the output consists of 4 rows
		}

	}

}
