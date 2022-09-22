package hwfonksiyoneliki;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class TestBook {

	public static void main(String[] args) {
		
		List<Book> books = BookFactory.getBookList();
		
		Book book1 = books.get(1);
		Book book2 = books.get(2);
		Book book3 = books.get(3);
		Book book4 = books.get(4);
		Book book5 = books.get(5);
		Book book6 = books.get(6);
		Book book7 = books.get(7);
		Book book8 = books.get(8);
		Book book14 = books.get(14);
		Book book15 = books.get(15);
		
		System.out.println("Book1: " +book1);
		System.out.println("Book2: " +book2);
		System.out.println("Book3: " +book3);
		System.out.println("Book4: " +book4);
		System.out.println("Book5: " +book5);
		System.out.println("Book6: " +book6);
		System.out.println("Book7: " +book7);
		System.out.println("Book8: " +book8);
		System.out.println("Book14: " +book14);
		System.out.println("Book15: " +book15);
		
		Comparator<Book> comparator1 = (o1, o2) -> o1.getPages() > o2.getPages() ? 1 : -1;

		BinaryOperator<Book> maxPage = BinaryOperator.maxBy(comparator1);

		
		Book maxPageBook = maxPage.apply(book1, book2);
		Book maxPageBook1 = maxPage.apply(book3, book4);
		Book maxPageBook2 = maxPage.apply(book5, book6);
		Book maxPageBook3 = maxPage.apply(book7, book8);
		Book maxPageBook4 = maxPage.apply(book14, book15);
		

		System.out.println("Which book has greater number of pages? Book1 or Book2 ? : " + maxPageBook );

		System.out.println("Which book has greater number of pages? Book3 or Book4 ? : " + maxPageBook1 );
		
		System.out.println("Which book has greater number of pages? Book5 or Book6 ? : " + maxPageBook2 );
		
		System.out.println("Which book has greater number of pages? Book7 or Book8 ? : "  + maxPageBook3);
	
		System.out.println("Which book has greater number of pages? Book14 or Book15 ? : " + maxPageBook4);

	}
	
	
	
}




