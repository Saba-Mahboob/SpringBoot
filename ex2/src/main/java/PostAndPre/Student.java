package PostAndPre;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


public class Student {
	public Student() {
		System.out.println(" initial from student");
	}
	private String name;
	private String family;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	@PostConstruct
	public void Postconstruct() {
		System.out.println("Apply PostConstruct in Student ");
		this.name="post";
	}
	@PreDestroy
	public void PreDestroy() {
		System.out.println("Apply PreDestroy in Student ");
		
	}
	
	

}
