/*
 * Author: Raymond Li
 * Date: 2017-12-04
 * Description: Factors or finds equation of line given 2 points
 */
import java.util.Scanner;

@SuppressWarnings("unused")

public class Math_Solver {
	public static void main(String[] args) {
		String exit;
		double a = 0, b = 0, c = 0;
		System.out.println("What would you like me to do?");
		Scanner sc = new Scanner(System.in);
		String response = sc.nextLine();
		do {
			if (response.equals("factor"))
				factor();
			else if (response.equals("equation")) {
				equation();
			}
			else {
				System.err.println("Invalid input, please enter a function.");
			}
			System.out.println("\nIf you would like to quit the program, enter 'quit'. Otherwise, enter anything else.");
			exit = sc.nextLine();
		} while (!exit.equals("quit"));
	}

	//factor method
	public static void factor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the a, b, and c to solve ax^2 + bx + c = 0");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		if (a != 0) {
			double root1, root2;
			if (b * b - 4 * a * c > 0) {
				root1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				root2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.println("x = " + root1 + " or x = " + root2);
			}
			else {
				root1 = -b + Math.sqrt(-(b * b - 4 * a * c)) / (2 * a);
				root2 = -b - Math.sqrt(-(b * b - 4 * a * c)) / (2 * a);
				System.out.println("x = " + root1 + "i or x = " + root2 + "i");
			}
		}
	}

	//equation method
	public static void equation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter x1");
		double x1 = sc.nextDouble();
		System.out.println("Please enter x2");
		double x2 = sc.nextDouble();
		System.out.println("Please enter y1");
		double y1 = sc.nextDouble();
		System.out.println("Please enter y2");
		double y2 = sc.nextDouble();
		double m = (y2 - y1) / (x2 - x1);
		double b = y1 - m * x1;
		System.out.println("The equation is " + m + "x - y + " + b + " = 0.");
	}
}
