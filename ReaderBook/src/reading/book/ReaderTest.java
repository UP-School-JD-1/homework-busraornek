package reading.book;


public class ReaderTest{
     
	
		 
   

	public static void main(String[] args) {
		
		Author author1 = new Author("Anthony Burgess");
		
		Book book2 = new Book("Otomatik Portakal" , 176, BookType.FICTION , true, 93, author1);
		
		Reader reader =new Reader("Büşra",24,'F');
	     //BookType
		reader.getData();
		book2.getData();
		author1.getData();
	}
	
	
}
