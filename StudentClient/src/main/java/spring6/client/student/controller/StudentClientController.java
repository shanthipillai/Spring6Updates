package spring6.client.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring6.client.student.model.Student;
import spring6.client.student.service.StudentClientService;

@RestController
@RequestMapping("/client/students")
public class StudentClientController {

	@Autowired
private	StudentClientService studentService;
	
	@GetMapping
	List<Student> getAllStudents()
	{
		return studentService.getAllStudents();
		
	}
}
