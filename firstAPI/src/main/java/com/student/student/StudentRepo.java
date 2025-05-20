package com.student.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentModule.Student;



@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{
	
        static String nu() {
		return "onnum  ila";
	}

}
