package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		
		Student s1=new Student("Ali", "mahboob", 18.5f, 17);
		Student s2=new Student("Baqer", "mahboob", 15.5f, 25);
		Student s3=new Student("mahdi", "sadeqi", 1f, 29);
		
//		creating a list of students
		Student [] studentArray = {s1,s2,s3};
		List<Student> Students= Arrays.asList(studentArray);
		
		
		
//		print list solution(1)
		
		System.out.println(Students);
		
		
//		print list solution(2)
		
		for (Iterator<Student> iterator = Students.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
			
		}
	

	
		
//		sorting by grade(1)
		
		Collections.sort(Students,new SortByGrade());
		System.out.println(Students);
		
		
//		sorting by grade (2)
		
		Students.sort((o1, o2) -> (int)(o1.getGrade()-o2.getGrade()));
		System.out.println(Students);
		
		
		
//		sorting by reverse name
		
		Comparator<Student> compareName = Comparator.comparing(Student ::getName);
		Students.sort(compareName.reversed());
		
		for (Iterator<Student> iterator = Students.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student.getName());
			
		}
		

		
//		group by age
		
		Map<Integer, List<Student>> groupAge = 
				Students.stream().collect(  Collectors.groupingBy(Student::getAge));
		System.out.println(groupAge);

		
//	    partitions by grade>10	
		
		Map<Boolean, List<Student>> bygrade = 
				Students.stream().collect( Collectors.partitioningBy(p -> p.getGrade()>10));	
		System.out.println(bygrade);
		
		
//		AVG of all grade
		
		double averageGrade = Students
				.stream()
				.mapToDouble(p -> p.getGrade())
				.average()
				.getAsDouble();
			    System.out.println(averageGrade);
			    
			    
//      AVG for age>18
			    
	    double averageGradebyAge = Students
				.stream()
				.filter(t ->t.getAge()>18 )
				.mapToDouble(p -> p.getGrade())
				.average()
				.getAsDouble();
	    System.out.println(averageGradebyAge);
	    	    		
	}

}
