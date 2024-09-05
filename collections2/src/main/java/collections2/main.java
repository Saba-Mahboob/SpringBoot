package collections2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {

	private static final Object person = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address a1= new Address("Tehran", "Iran", "Bookan");
		Address a2= new Address("Hamedan", "Iran", "ketab");
		Address a3= new Address("veniz", "ITLY", "darband");

		Person p1= new Person("saba", "mahboob", 22, a1);
		Person p2= new Person("saber", "mahboob", 25, a1);
		Person p3= new Person("mahdi", "tayeri", 25, a2);
		Person p4= new Person("soroush", "naraqi", 25, a3);
		
		List<Person> persons =new ArrayList<>();
		persons.add(p4);
		persons.add(p3);
		persons.add(p2);
		persons.add(p1);
		System.out.println(persons);
		
//		persons.remove(0);
//		System.out.println(persons);
		
		Person p5=new Person("saba", "ashrafi", 20, a3);
// it returns true because I override equal method by only name not every parameter		
		System.out.println(persons.contains(p5));
		System.out.println(persons.indexOf(p5));
		
		
// sort by street		
		Collections.sort(persons,new CompareByStreet());
		System.out.println(persons);
		
		
		
// binary search
		 int ind= Collections.binarySearch(persons,p1);
		
	
	}

}
