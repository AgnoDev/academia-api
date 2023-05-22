package me.dio.academia.digital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class AcademiaDigitalApplication {

	@GetMapping
	public String getHomeTest(){
		return "Academia SouFit - Testando API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(AcademiaDigitalApplication.class, args);
	}

}
