package hwtorbalarbir.iki;

import java.util.Comparator;

public class ComparatorStudent implements Comparator<AbstractStudent>{
	
	@Override
	
	public int compare(AbstractStudent student1, AbstractStudent student2) {
		
		if(student1.getNo() < student2.getNo()) 
			return 1;
		else if (student1.getNo() == student2.getNo())
			return 0;
		
		else 
			return -1;
			
		
		}
		
		
	}


