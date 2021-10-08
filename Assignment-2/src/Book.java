
public class Book {

	String book_title;
	String author;
	int price;
	int page_num;
	String publication;
	String edition;

	void showInfo() {
		System.out.println("Book Title: " + book_title);
		System.out.println("Author: " + author);
		System.out.println("Number of pages: " + page_num);
		System.out.println("Price: " + price + " tk");
		System.out.println("Publication: " + publication);
		System.out.println("Book Edition: " + edition);

	}

}


