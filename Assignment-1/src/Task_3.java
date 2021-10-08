
import java.util.Scanner;
public class Task_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an Integer: ");
		int num=input.nextInt();
		
		for (int i=1; i<=num; i++)
		{
			for (int j=num-1; j>=i; j--)
			{
				System.out.print("  ");
			}
			for (int k=1; k<=i; k++)
			{
				System.out.print(k+ " ");
			}
			System.out.println("");
		}
	}
}
