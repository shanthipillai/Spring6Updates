package spring6.client.student.service;

import java.util.List;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import spring6.client.student.model.Student;

@HttpExchange("/students")
public interface StudentClientService {

	@GetExchange
	List<Student> getAllStudents();

	
	
}
