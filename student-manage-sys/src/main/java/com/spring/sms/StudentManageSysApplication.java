package com.spring.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.sms.entity.Student;
import com.spring.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManageSysApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManageSysApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Rakshitha","Ravindra","arkshitha@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Sushan","Aralu","sushan@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Sumathi","Ravindra","sumathi@gmail.com");
//		studentRepository.save(student3);	
	}
}
