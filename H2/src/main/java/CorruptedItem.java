import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Corrupted-Item")
public class CorruptedItem {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY )
	private long id;
	
	
	@Column(name = "corrrupt-reason")
	private String reason;
	
	
	 @Column(unique = true)
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "Item-Id", referencedColumnName = "id")
	 private Item item;


	 
	 
	public CorruptedItem( String reason, Item item) {
		super();
		this.reason = reason;
		this.item = item;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getReason() {
		return reason;
	}


	public void setReason(String reason) {
		this.reason = reason;
	}


	public Item getItem() {
		return item;
	}


	public void setItem(Item item) {
		this.item = item;
	}


	@Override
	public String toString() {
		return "CorruptedItem [id=" + id + ", reason=" + reason + ", item=" + item + "]";
	}
	 
	 
	 

	

}
