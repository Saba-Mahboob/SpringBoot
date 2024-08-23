package Validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class test {

	public static void main(String[] args) {
		ApplicationContext cnx =  SpringApplication.run(test.class, args);
		StudentByAnnotation s=cnx.getBean(StudentByAnnotation.class);
		s.setAge(10);
		s.setName("s");
		s.setFamily("Mahboob");
		s.setEmail("dsfjksjfh");
		System.out.println(s.getEmail());
		
        var validator = cnx.getBean(StudentByProgramming.class);		
		
		validator.validateInput(s);
		
	}

}
