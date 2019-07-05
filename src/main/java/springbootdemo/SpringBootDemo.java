package springbootdemo;

//import org.springframework.boot.autoconfigure.*;
//import org.springframework.stereotype.*;
//import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.joda.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

//@Controller
//@EnableAutoConfiguration
//@SpringBootApplication

public class SpringBootDemo {

//	@RequestMapping("/")
//	@ResponseBody
//	String home() {
//		LocalTime currentTime = new LocalTime();
//		return "Welcome!" + currentTime;
//	}
	
    private static final Logger log = LoggerFactory.getLogger(SpringBootDemo.class);

	
	public static void main(String[] args) throws Exception {
		
		RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
        
//		SpringApplication.run(SpringBootDemo.class, args);
	}
}
