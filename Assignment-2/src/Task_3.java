
public class Task_3 {

	public static void main(String[] args) {
		BillCalculator Bill=new BillCalculator();
		
		System.out.println("Bill for 25 unit: "+Bill.getTotalBill(25));
		System.out.println("Bill for 250 unit: "+Bill.getTotalBill(250));
		System.out.println("Bill for 812 unit: "+Bill.getTotalBill(812));
	}

}


