package com.sms.service;

import java.util.List;

import com.sms.entity.Student;
import com.sms.service.impl.StudentServiceImpl;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStuedntById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);


}
