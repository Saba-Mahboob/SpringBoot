package Validation;


import org.springframework.stereotype.Component;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
@Component
public class StudentByAnnotation {
	@NotNull
	@Size(min=3, max=20)
	private String name;
	@NotNull
	@Size(min=3, max=20)
	private String family;
	@NotNull
	@Min(18)
	private int age;
	@NotNull
	@Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$")
	private String email;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "StudentByAnnotation [name=" + name + ", family=" + family + ", age=" + age + ", email=" + email + "]";
	}
	
	

}
