package shapes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Create a shape by typing in a number below\nRectangle: 1\nTriangle: 2\nCircle: 3");
		Scanner in = new Scanner(System.in);
		int choice;
		int choice2;
		int choice3;
		int choice4;
		int recLength;
		int recWidth;
		do {
			System.out.println("Do you want to:");
			System.out.println("1. Create a shape");
			System.out.println("2. View a shape");
			System.out.println("3. Change a shape");
			System.out.println("4. Quit");
			System.out.println("Your Choice:"); 
			choice = in.nextInt();
			if (choice == 1) {
				System.out.println("Do you want to create a:");
				System.out.println("1. Rectangle");
				System.out.println("2. Triangle");
				System.out.println("3. Circle");
				System.out.println("Your Choice:"); 
				choice2 = in.nextInt();
				if (choice2 ==1) {
					Rectangle r = new Rectangle(1, 1);
					System.out.println("What do you want the length to be?");
					recLength = in.nextInt();
					r.setLength(recLength);
					System.out.println("What do you want your width to be?");
					recWidth= in.nextInt();
					r.setWidth(recWidth);
					r.printStats();
				}
				if (choice2==2) {
//					Triangle t = new Triangle(1,1);
				}
				
			} else if (choice == 2) {
				System.out.println("Your choices are:");
				System.out.println("1. View Rectangle");
				System.out.println("2. View Triangle");
				System.out.println("3. View Circle");

			} else if (choice == 3) {
				System.out.println("Your choices are:");
				System.out.println("1. Change Rectangle");
				System.out.println("2. ChangeTriangle");
				System.out.println("3. Change Circle");
			}
		} while (choice != 4);

	}

	

}
