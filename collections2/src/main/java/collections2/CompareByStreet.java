package collections2;

import java.util.Comparator;

public class CompareByStreet implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getAddress().getStreet().compareToIgnoreCase(o2.getAddress().getStreet());
	}

}
