package com.student.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;



@SpringBootApplication(scanBasePackages = {"com.studentModule","com.studentController", "com.studentService", "com.studentRepo"})

//@EnableJpaRepositories(basePackages = "com.student.student")
@EntityScan(basePackages = "com.studentModule")

public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

}
