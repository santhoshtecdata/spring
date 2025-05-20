package com.studentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.student.StudentRepo;
import com.studentModule.Student;


@Service
public class StudentService {
	
	@Autowired
	public StudentRepo repo;
	
	public Student student;
	
 public List<Student> studentName() {

	 return  repo.findAll();
 }

 
public String addStudent( String city, String name) {
	Student student = new Student(city,name);
	repo.save(student);
	return "student added succesfully..";
}


public String addStudent2(Student student2) {
	repo.save(student2);

	return  "student added succesfully..via constractor";
	
}


public String in() {
	
	return StudentRepo.nu();
}


public String data() {
	
	return "Be Cool";
}

   }
