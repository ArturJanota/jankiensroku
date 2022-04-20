package pl.zajecia.jankiensroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JankiensrokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(JankiensrokuApplication.class, args);
	}


	@GetMapping
	public String get(){
		return "hello dcarkness my old friend";
	}
}
