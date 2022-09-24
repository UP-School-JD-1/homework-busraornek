package hwtorbalariki;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class PersonTest {

	public static void main(String[] args) {
		
		ArrayList<String> adress = new ArrayList <String> ();
		adress.add("Muğla");
		
		ArrayList<String> adress1 = new ArrayList <String> ();
		adress1.add("Gaziantep");
		
		ArrayList<String> adress2 = new ArrayList <String> ();
		adress2.add("Eskişehir");
		
		ArrayList<String> adress3 = new ArrayList <String> ();
		adress3.add("Mersin");
		
		ArrayList<Integer> phone = new ArrayList <Integer> ();
		phone.add((Integer) 507456780);
		
		ArrayList<Integer> phone1 = new ArrayList <Integer> ();
		phone1.add((Integer) 553576787);
		
		ArrayList<Integer> phone2 = new ArrayList <Integer> ();
		phone2.add((Integer) 507456780);
		
		ArrayList<Integer> phone3 = new ArrayList <Integer> ();
		phone3.add((Integer) 507457860);
		
		
		
		Person p1 = new Person("Büşra", "Örnek" , adress , phone);
		Person p2 = new Person("Ela", "Yaz" , adress1 , phone1);
		Person p3 = new Person("Serkan", "Akın" , adress2 , phone2);
		Person p4 = new Person("Nida", "Kale" , adress3 , phone3);
		Person p5 = new Person("Nida", "Kale" , adress3 , phone3);
		
		
		TreeSet<Person> person = new TreeSet<>();
		person.add(p1);
		person.add(p2);
		person.add(p3);
		person.add(p4);
		person.add(p5);
		
		person.comparator();
		person.forEach(person5 -> System.out.println(person5.getSurName()) );
		
		
		System.out.println("**********************");
		
		Iterator<Person> i = person.iterator();
		while (i.hasNext()) {
		     
			 Person per = (Person) i.next();
			 System.out.println(per.getName() + " " + per.getSurName() + " " + per.getAdres() + " " + per.getPhone());
			 
		}
		
	
}
}
