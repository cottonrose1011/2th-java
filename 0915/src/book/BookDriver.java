package book;

import java.util.ArrayList;

public class BookDriver {

	public static void main(String[] args) {
		ArrayList<Book> arrayList = new ArrayList<>();
		
		arrayList.add(new TheGreatGastsby());
		arrayList.add(new TheOldManAndTheSea());
		
		for(Book book : arrayList) {
			book.printAuthor();
		}
	}

}
