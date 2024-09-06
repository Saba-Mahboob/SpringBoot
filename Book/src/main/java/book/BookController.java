package book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")


public class BookController {
	
	
	@GetMapping("/book")
	public String ReturnWelcome() {
		return "HI,Welcome to Get Mapping Request";
		
	}

}
