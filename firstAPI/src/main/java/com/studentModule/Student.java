package com.studentModule;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studentId;
	
	private String name;
	
	private String city;

	public Student(String name, String city) {
		
		this.name = name;
		this.city = city;
	}

	
	public Student() {
		
	}

	



}
