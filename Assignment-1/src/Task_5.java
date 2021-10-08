
import java.util.Scanner;
public class Task_5 {

	public static void main(String[] args) {
		int count=0;
		Scanner input= new Scanner (System.in);
		System.out.print("Enter the number of elements: ");
		int num= input.nextInt();
		System.out.print("Enter "+ num + " integers: ");
		int arr[] =new int [num];
		
		for(int i=0; i<num; i++)
		{
			arr[i]= input.nextInt();
		}
		System.out.print("Enter the number to search: ");
		int num2= input.nextInt();
		
		for(int holder:arr)
		{
			if(holder==num2)
			{
				count++;
			}
		}
		System.out.println(num2+" occurred "+count+" times in the array.");
	}
}
