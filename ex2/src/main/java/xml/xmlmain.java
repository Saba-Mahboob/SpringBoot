package xml;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class xmlmain {

	public static void main(String[] args)    {
		// TODO Auto-generated method stub
		ApplicationContext cnx =new ClassPathXmlApplicationContext("xml.xml");
		Student s= (Student) cnx.getBean("studentid");
		s.setName("Saba");
		s.setFamily("Mahboob");
		
		
		
		Grade g =(Grade) cnx.getBean("gradeid");
		g.setGrade1(10.25f);
		g.setGrade2(12.75f);
		
		Display d=(Display) cnx.getBean("displayid");
		System.out.println(d.displyMygrade(s, g));

	}

}
