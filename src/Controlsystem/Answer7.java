package Controlsystem;

import java.util.Scanner;

public class Answer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// Taking input from the user
		System.out.println("Enter the first number: "); // Input first number
		double firstNumber = sc.nextDouble();

		System.out.println("Enter the second number: "); // Input second number
		double secondNumber = sc.nextDouble();

		System.out.println("Enter the third number: "); // Input third number
		double thirdNumber = sc.nextDouble();

		// Calculating the largest number
		double largest = firstNumber;

		if (secondNumber > largest) {
			largest = secondNumber;
		}

		if (thirdNumber > largest) {
			largest = thirdNumber;
		}

		// Printing the result
		System.out.println("The largest number is: " + largest);
		// If first number = 15; second number = 20; third number = 24
		// Output will be the largest number is 24
	}

}
