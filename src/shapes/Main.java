package shapes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Create a shape by typing in a number below\nRectangle: 1\nTriangle: 2\nCircle: 3");
		Scanner in = new Scanner(System.in);
		int userChoice;
		do {
			System.out.println("Do you want to:");
			System.out.println("1. Create a shape");
			System.out.println("2. View a shape");
			System.out.println("3. Change a shape");
			System.out.println("4. Quit");
			userChoice = in.nextInt();
			if (userChoice == 1) {
				System.out.println("Your choices are:");
				System.out.println("1. Rectangle");
				System.out.println("2. Triangle");
				System.out.println("3. Circle");

			} else if (userChoice == 2) {
				System.out.println("Your choices are:");
				System.out.println("1. Rectangle");
				System.out.println("2. Triangle");
				System.out.println("3. Circle");

			} else if (userChoice == 3) {
				System.out.println("Your choices are:");
				System.out.println("1. Rectangle");
				System.out.println("2. Triangle");
				System.out.println("3. Circle");
			}
		} while (userChoice != 4);

	}

	Rectangle r = new Rectangle(3, 5);
//	r.printStats();
//	r.setLength(8);;
//	r.printStats();
}
