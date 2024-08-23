package Springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import Annotation.Display;
import Annotation.Grade;
import Annotation.Student;

@SpringBootApplication
public class SpringBootMain implements CommandLineRunner {
	
		  private final ApplicationContext cnx;

		  public SpringBootMain(ApplicationContext cnx) {
		    this.cnx = cnx;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringBootMain.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
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
