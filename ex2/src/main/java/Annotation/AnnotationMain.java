package Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cnx=new ClassPathXmlApplicationContext("annotationConfig.xml");
		Student s =cnx.getBean(Student.class);
		Grade g= cnx.getBean(Grade.class);
		
		
		s.setName("Saba");
		s.setFamily("Mahboob");
		g.setGrade1(11.25f);
		g.setGrade2(15.75f);
		Display d=cnx.getBean(Display.class);
		System.out.println(d.toString());
	

	}

}
