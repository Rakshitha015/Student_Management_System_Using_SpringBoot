package com.spring.sms.service;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.spring.sms.entity.Student;

@Controller
public interface StudentService {

	List<Student> getAllStudents();
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	void deleteStudentById(Long id);
	
}
