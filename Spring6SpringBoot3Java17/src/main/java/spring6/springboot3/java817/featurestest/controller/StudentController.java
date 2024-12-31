package spring6.springboot3.java817.featurestest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring6.springboot3.java817.featurestest.model.Student;
import spring6.springboot3.java817.featurestest.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping
	
	public Student addStudent(@RequestBody Student student)
	{
		return studentService.addStudent(student);
	}
	
	@GetMapping
	public List<Student> getAllStudents()
	{
		return studentService.getAllStudents();
	}
	
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable String id)
	{
		return studentService.getStudentById(id);
	}
}
