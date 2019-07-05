package springbootdemo;

import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Controller
@EnableAutoConfiguration
@SpringBootApplication

public class SpringBootDemo {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Welcome!";
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootDemo.class, args);
	}
}
