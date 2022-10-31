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
		double recLength;
		double recWidth;
		double triA;
		double triB;
		double triC;
		double Radius;
		Rectangle r = new Rectangle(1, 1);
		Triangle t = new Triangle(1, 1, 1);
		Circle c = new Circle(1);
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
					System.out.println("What do you want the length to be?");
					recLength = in.nextDouble();
//					r.setLength(recLength);
					System.out.println("What do you want your width to be?");
					recWidth= in.nextDouble();
//					r.setWidth(recWidth);
					r=new Rectangle(recLength,recWidth);
					r.printStats();
				}
				else if (choice2==2) {
					System.out.println("What do you want side A to be?");
					triA = in.nextDouble();
					t.setSideA(triA);
					System.out.println("What do you want side B to be?");
					triB= in.nextDouble();
					t.setSideB(triB);
					System.out.println("What do you want side C to be?");
					triC= in.nextDouble();
					t.setSideC(triC);
					t.printStats();
				}
				else if (choice2==3) {
					System.out.println("What do you want the radius to be?");
					Radius= in.nextDouble();
					c.setRadius(Radius);
					c.printStats();
				}
				else {
					System.out.println("You can't do that");
				}
				
			} else if (choice == 2) {
				System.out.println("Your choices are:");
				System.out.println("1. View Rectangle");
				System.out.println("2. View Triangle");
				System.out.println("3. View Circle");
				choice3=in.nextInt();
				if(choice3==1) {
					r.printStats();
				}
				else if (choice3==2) {
					t.printStats();
				}
				else if (choice3==3) {
					c.printStats();
				}
				else {
					System.out.println("You can't do that");
				}

			} else if (choice == 3) {
				System.out.println("Your choices are:");
				System.out.println("1. Change Rectangle");
				System.out.println("2. ChangeTriangle");
				System.out.println("3. Change Circle");
				choice4=in.nextInt();
				if (choice4==1) {
					System.out.println("What do you want the length to be?");
					recLength = in.nextDouble();
					r.setLength(recLength);
					System.out.println("What do you want your width to be?");
					recWidth= in.nextDouble();
					r.setWidth(recWidth);
					System.out.println("Done! You can check it choosing the view option");
				}
				else if (choice4==2) {
					System.out.println("What do you want side A to be?");
					triA = in.nextDouble();
					t.setSideA(triA);
					System.out.println("What do you want side B to be?");
					triB= in.nextDouble();
					t.setSideB(triB);
					System.out.println("What do you want side C to be?");
					triC= in.nextDouble();
					t.setSideC(triC);
					System.out.println("Done! You can check it choosing the view option");
				}
				else if (choice4==3) {
					System.out.println("What do you want the radius to be?");
					Radius= in.nextDouble();
					c.setRadius(Radius);
					System.out.println("Done! You can check it choosing the view option");
				}
				else {
					System.out.println("You can't do that");
				}
			}
		} while (choice != 4);
		System.out.println("Cya!");
		System.out.println("*Windows shutdown sound*");
	}

	

}
