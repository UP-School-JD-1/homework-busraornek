package hwtorbalariki;

import java.util.ArrayList;

import java.util.Objects;


public class Person implements Comparable{
	
	private final String name;
	private final String surName;
	private ArrayList<String> adres;
	private ArrayList<Integer> phone;
	
	public Person(String name, String surName, ArrayList<String> adres, ArrayList<Integer> phone) {
		this.name = name;
		this.surName = surName;
		this.adres = adres;
		this.phone = phone;
	}

	public ArrayList<String> getAdres() {
		return adres;
	}

	public void setAdres(ArrayList<String> adres) {
		this.adres = adres;
	}

	public ArrayList<Integer> getPhone() {
		return phone;
	}

	public void setPhone(ArrayList<Integer> phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getSurName() {
		return surName;
	}

	@Override
	public int compareTo(Object o) {
		Person person1 = (Person) o;
		return surName.compareTo(person1.surName);
	}



	@Override
	public int hashCode() {
		return Objects.hash(adres, name, phone, surName);
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", surName=" + surName + ", adres=" + adres + ", phone=" + phone + "]";
	}



	
}
