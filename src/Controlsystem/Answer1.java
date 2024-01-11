package Controlsystem;

import java.util.Scanner;

public class Answer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: "); // Input any name

		String inputString = sc.nextLine();

		boolean isPalindrome = true;

		int length = inputString.length();

		// Using a for loop to check if the string is a Palindrome

		for (int i = 0; i < length / 2; i++) {

			if (inputString.charAt(i) != inputString.charAt(length - i - 1)) {

				isPalindrome = false;

				break;
			}

		}

		// Using if-else statement to print the result

		if (isPalindrome) {

			System.out.println(inputString + " is a palindrome.");

			// If the input was "madam", the output will be "madam is a palindrome"
		}

		else {

			System.out.println(inputString + " is not a palindrome.");

			// If the input was "bike", the output will be "bike is not a palindrome"
		}

	}

}
