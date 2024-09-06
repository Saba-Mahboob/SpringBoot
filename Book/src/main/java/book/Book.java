package book;

import org.springframework.stereotype.Component;

@Component
public class Book {	
	private String name;
	private String publisherName;
	private int NumberOfpages;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public int getNumberOfpages() {
		return NumberOfpages;
	}
	public void setNumberOfpages(int numberOfpages) {
		NumberOfpages = numberOfpages;
	}
	public Book(String name, String publisherName, int numberOfpages) {
		super();
		this.name = name;
		this.publisherName = publisherName;
		NumberOfpages = numberOfpages;
	}
	
	

}
