
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan
@EnableJpaRepositories
public class main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hi");
		ConfigurableApplicationContext context = SpringApplication.run(main.class, args);

		BaseRun BaseRun = context.getBean(BaseRun.class);
		BaseRun.sampleRun();
		
	
		

	}

}
