package com.gerry.pang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerry.pang.config.EnableMySpringTestConfiguration;
import com.gerry.pang.domain.Student;

@RestController
@EnableMySpringTestConfiguration
@SpringBootApplication
@SuppressWarnings("unused")
public class SpringTestApplication {

	private static ApplicationContext applicationContext;

	@Autowired
	private Student demoStudent;
	
	@GetMapping("/getDemoSudent")
	public Student getDemoSudent() {
		return demoStudent;
	}
	
	public static void main(String[] args) {
		applicationContext = SpringApplication.run(SpringTestApplication.class, args);
		System.out.println("======= spring boot start success ======= ");
	}

}
