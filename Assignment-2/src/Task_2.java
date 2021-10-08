
public class Task_2 {
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();

		//Storing information
		book1.book_title = "JAVA for Beginners";
		book1.edition = "3rd edition";
		book1.author = "Prof. David";
		book1.page_num = 537;
		book1.price = 299;
		book1.publication = "Easy Coding Publications";
		
		book2.book_title = "Omega Point";
		book2.edition = "12th edition";
		book2.author = "By Humayun Ahmed";
		book2.page_num = 122;
		book2.price = 128;
		book2.publication = "Shomoy Prokashoni";

		book3.book_title = "Digital Fortress";
		book3.edition = "5th edition";
		book3.author = "Dan Brown";
		book3.page_num = 356;
		book3.price = 520;
		book3.publication = "St. Martin Press";

		// ShowInfo
		System.out.println("book1 ");
		book1.showInfo();
		System.out.println("\nbook2 ");
		book2.showInfo();
		System.out.println("\nbook3 ");
		book3.showInfo();

		/// printing memory address of all objects
		System.out.println("\nMemory Address: ");
		System.out.println("Book1 = " + book1);
		System.out.println("Book2 = " + book2);
		System.out.println("Book3 = " + book3+"\n");
		System.out.println("");

		book1 = book3;
		book1.edition = "1st edition";
		book3.showInfo();

		/// printing memory address of all objects
		System.out.println("\nMemory Address: ");
		System.out.println("Book1 = " + book1);
		System.out.println("Book2 = " + book2);
		System.out.println("Book3 = " + book3+"\n");
	}
}




