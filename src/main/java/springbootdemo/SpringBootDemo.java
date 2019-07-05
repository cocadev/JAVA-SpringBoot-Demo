package springbootdemo;

import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.joda.time.LocalTime;

@Controller
@EnableAutoConfiguration
@SpringBootApplication

public class SpringBootDemo {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		LocalTime currentTime = new LocalTime();
		return "Welcome!" + currentTime;
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootDemo.class, args);
	}
}
