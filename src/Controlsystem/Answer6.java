package Controlsystem;

import java.util.Scanner;

public class Answer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of the month (1-12): "); // Enter any month from Jan to Dec
		int month = sc.nextInt();

		System.out.println("Enter the room rent per day: "); // Enter room rent per day
		double rentPerDay = sc.nextDouble();

		System.out.println("Enter the number of days stayed in the hotel: "); // Enter number of days stayed in hotel
		int numberOfDays = sc.nextInt();

		double totalTariff = calculateTariff(month, rentPerDay, numberOfDays);

		System.out.printf("The hotel tariff to be paid is: %.2f%n", totalTariff);
	}

	public static double calculateTariff(int month, double rentPerDay, int numberOfDays) {
		double tariff = rentPerDay * numberOfDays;
		// Check if it is peak season
		switch (month) {
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			tariff *= 1.20; // 20% increase for peak season
			break; // If it is "April", 1500 per day, 2 days stay, then total tariff is 3600
		default:
			// Non-peak months have no additional charge
			break; // If it is "March", 1500 per day, 2 days stay, then total tariff is 3000
		}
		return tariff;
	}

}
