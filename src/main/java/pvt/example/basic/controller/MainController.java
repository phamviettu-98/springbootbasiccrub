package pvt.example.basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class MainController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json")
	public String hello() {
		return "hello";
	}

}
