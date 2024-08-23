package Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Display {
	@Autowired
	Student s;
	@Autowired
	Grade g;
	@Override
	public String toString() {
		return "Name=" + s.getName() + ", Grade=" + g.getmeMygrade() ;
	}




}
