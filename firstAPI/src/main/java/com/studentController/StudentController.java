package com.studentController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.studentModule.Student;
import com.studentService.StudentService;


@RestController
@CrossOrigin(origins = {"http://localhost:5500","http://127.0.0.1:5500/","http://127.0.0.1:5500"})

@RequestMapping("student")
public class StudentController {
	
	@Autowired
	StudentService stu; 
	
	@GetMapping("name")
	public List<Student> name() {
		return stu.studentName();
	}
	
	
	@PostMapping("add")
	public String add(@RequestParam("city") String city,@RequestParam("name") String name) {
		System.out.println(" this is backEnd");
		
		return stu.addStudent(city,name);
		
	}
	
	@PostMapping("add/stu")
	public String studentAdd(@RequestBody Student student ) {
	    
		return stu.addStudent2(student);
	}
	
	@GetMapping("/db")
    public String inte() {
    	return stu.in();
    }
	
	@GetMapping("data")
	public String data() {
		return stu.data();
	}
	/*@GetMapping("date")
	 * public date date () {
	 *      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
			LocalDateTime now = LocalDateTime.now();  
			return dtf.format(now);
	 * }
	 */
	
}
