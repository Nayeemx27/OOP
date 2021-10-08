
import java.util.Scanner;
public class Task_2 {
	public static void main(String[] args) {
		int cntpos=0, cntneg=0;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter 10 Numbers: ");
		for (int i=0; i<10; i++)
		{
			int num=input.nextInt();
			if (num>=0)
			{
				cntpos++;
			}
			else {
				cntneg++;
			}
		}
		System.out.println("Positive Numbers: "+cntpos);
		System.out.println("Negative Numbers: "+cntneg);
	}
}
