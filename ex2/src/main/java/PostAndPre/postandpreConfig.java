package PostAndPre;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
@Configuration
@ComponentScan
public class postandpreConfig {
	
@Bean
//@Lazy
 public Student getstudent() {
	return new Student();
}

@Bean@Lazy
public Grade getgrade() {
	return new Grade();
}
@Bean@Lazy
public Display getdisplay() {
	return new Display();
}


}
