package collections;

public class Student {
	private String name;
	private String family;
	private float grade;
	private int age;
	
	public Student(String name, String family, float grade, int age) {
		super();
		this.name = name;
		this.family = family;
		this.grade = grade;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", family=" + family + ", grade=" + grade + ", age=" + age + "]";
	}

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

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	
}
