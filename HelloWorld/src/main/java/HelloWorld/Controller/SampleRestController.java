package HelloWorld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

	@GetMapping("/hello")
	public String hello(){
		return "Hello World!!!!";
	}
}
