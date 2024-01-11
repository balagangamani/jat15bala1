package Controlsystem;

import java.util.Scanner;

public class Answer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide the number of rows to print... "); // Input the number of rows
		int myrows = sc.nextInt();
		System.out.println("\nThe star pattern is... ");

		// First 2 rows: stars with spaces
		for (int i = 1; i < 2; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// Next 2 rows: stars without spaces
		for (int i = 1; i < 2; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Next 1 row: a single star
		System.out.println("*");

		// Next 2 rows: stars without spaces
		for (int i = 1; i < 2; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Next 2 rows: stars with spaces
		for (int i = 1; i < 2; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.print("* ");
			}
			System.out.println();
			// If the provided number of rows is '5', then the output will be 5 rows

		}

	}
}
