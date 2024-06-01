package Assignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		double n1 = sc.nextInt();
		System.out.println("enter secoend number");
		double n2 = sc.nextInt();
		System.out.println("Enter a choice");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.divison");
		System.out.println("4.module");

		System.out.println("enter a choice");
		int choice = sc.nextInt();

		double result = 0;
		switch (choice) {
		case 1:
			result = n1 + n2;
			break;

		case 2:
			result = n1 - n2;
			break;

		case 3:
			result = n1 * n2;
			break;

		case 4:
			result = n1 / n2;
			break;

		default:
			System.out.println("Invalid choice. Please choose a valid operation (1-4).");

		}

		System.out.println("result is" + result);
	}

}
