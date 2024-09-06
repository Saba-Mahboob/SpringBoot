import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Item-table")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "Item-name")
	private String name;
	
	@Column(name = "Item-category")
	@Enumerated(EnumType.STRING)
	category c;
	
	@Column(name = "Item-price")
	private double price;
	
	
	

	public Item( String name, category c, double price) {
		super();
		this.name = name;
		this.c = c;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public category getC() {
		return c;
	}

	public void setC(category c) {
		this.c = c;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", c=" + c + ", price=" + price + "]";
	}
	
	
	
	

}
