package com.brian.hellohuman;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class HumanController {
	@RequestMapping("/")
	public String greet(@RequestParam(value = "name", required=false)  String searchQuery, @RequestParam(value="lname") String lname ) {
		if (searchQuery == null) {
			return "Hello Human";
		}
		else {
		return "Hello " + searchQuery + " " + lname;
		}
	}
	@RequestMapping("/s")
	public String greetMultiple(@RequestParam(value = "name", required = false) String searchQuery, @RequestParam(value="times") String times) {
		if (searchQuery == null) {
			return "Hello Human";
		}
		else {
			String sentence = " ";
			int newTime = Integer.parseInt(times);
			for(int i = 0; i < newTime; i++) {
				sentence = sentence + " Hello " + searchQuery;
			}
			System.out.print(sentence);
			return sentence;
		}
	}
	

}
