import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Component
public class BaseRun {
	@PersistenceContext
	private static EntityManager entityManager;
	
	
	public void sampleRun() {
		entityManager=entityManager.getEntityManagerFactory().createEntityManager();		
		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.getTransaction();
		
		
		transaction.begin();
		
		Item i1=  new Item ( "Mobile",category.ELECTRONICAL , 5000);
		Item i2=  new Item ( "Laptop",category.ELECTRONICAL , 25000);
		Item i3=  new Item ( "desk",category.FURNITURE , 2000);
		Item i4=  new Item ( "T-shirt",category.CLOTHING , 100);
		
		session.persist(i1);
		session.persist(i2);
		session.persist(i3);
		session.persist(i4);
	
    	transaction.commit();
    	
    	
    	
    	
    	transaction.begin();
    	session.quer
		
	}
}
