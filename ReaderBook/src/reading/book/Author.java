package reading.book;

public class Author {
	
		String name;
		
		Author(String name){
			this.name = name;
		}

		public String getName() {
			return name;
		}
		
		public void setName(String name) {
		    this.name = name;
		    
	 }
		public void getData (){
			
			System.out.println("Author Information : name = " + name);
		}
}
