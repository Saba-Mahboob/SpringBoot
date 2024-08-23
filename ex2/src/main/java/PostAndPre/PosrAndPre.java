package PostAndPre;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PosrAndPre {
	public static void main(String...arg) {
		AnnotationConfigApplicationContext cnx=new AnnotationConfigApplicationContext(postandpreConfig.class);
		cnx.close();
		
	}

}
