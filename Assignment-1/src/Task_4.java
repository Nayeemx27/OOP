
import java.util.Scanner;
public class Task_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int input1 = scan.nextInt();
		
		System.out.print("Enter second number: ");
		int input2 = scan.nextInt();
		
		System.out.println("");
		
		System.out.println("1. Addition (+).");
		System.out.println("2. Subtraction (-).");
		System.out.println("3. Multiplication (*).");
		System.out.println("4. Division (/).");
		
		System.out.print("Enter operation number: ");
		int input3 = scan.nextInt();
		System.out.println("");

		switch (input3) {
		case 1:
			System.out.print("The result is " + (input1 + input2));
			break;
		case 2:
			System.out.print("The result is " + (input1 - input2));
			break;
		case 3:
			System.out.print("The result is " + (input1 * input2));
			break;
		case 4:
			if (input2 != 0) {
				System.out.print("The result is " + (float)input1 / (float)input2);
			} else {
				System.out.println("The result is Invalid");
			}
			break;
		default:
			System.out.print("Operation " + input3 + " does not exits");
			break;

		}
	}
}
