package vaquita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
	public String add(){
		return "index";
	}

}

// @RestController
// public class HomeController {

//     GetMapping("/")
// 	public String index() {
// 		return "Greetings from Spring Boot!";
// 	}

// }
