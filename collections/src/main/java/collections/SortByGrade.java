package collections;

import java.util.Comparator;

public class SortByGrade implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getGrade()-o2.getGrade());
	}

}
