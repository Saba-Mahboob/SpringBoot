package collections2;

import java.util.Objects;

public class Person {
	@Override
	public int hashCode() {
		return Objects.hash(address, age, family, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}


	private String name;
	private String family;
	private int age;
	
	
	Address address;
	
	
	
	
	public Person(String name, String family, int age, Address address) {
		super();
		this.name = name;
		this.family = family;
		this.age = age;
		this.address = address;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", family=" + family + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	

}
