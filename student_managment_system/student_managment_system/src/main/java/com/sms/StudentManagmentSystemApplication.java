package com.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sms.entity.Student;
import com.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1=new Student((long) 1, "Vishal", "Mane",
		 * "vishalmane@gmail.com"); studentRepository.save(student1);
		 * 
		 * Student student2=new Student((long) 2, "Omkar", "Giri",
		 * "omkargiri@gmail.com"); studentRepository.save(student2);
		 * 
		 * Student student3=new Student((long) 3, "Gaurav", "Deshmukh",
		 * "gauravdeshmukh@gmail.com"); studentRepository.save(student3);
		 */
	}

}
