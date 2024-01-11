package Controlsystem;

import java.util.Scanner;

public class Answer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string name: "); // Enter "Guvi" as string name

		String inputString = sc.nextLine();

		String reversedString = "";

		// For loop is used to reverse the string

		for (int i = inputString.length() - 1; i >= 0; i--) {

			reversedString += inputString.charAt(i);
		}

		// Output of the reversed string is displayed

		// If the input of the string was "Guvi", the output will be "ivuG"

		System.out.println("Reversed string: " + reversedString);

	}
}
