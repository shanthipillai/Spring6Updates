package spring6.springboot3.java817.featurestest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import jakarta.servlet.http.HttpServlet;
import spring6.springboot3.java817.featurestest.model.Student;

@Service
public class StudentService {

	//HttpServlet
	List<Student> studentlist=new ArrayList<Student>();
	@Autowired
	private ObservationRegistry observationRegistry;

	public Student addStudent(Student student) {
		studentlist.add(student);
		return Observation.createNotStarted("addStudent", observationRegistry).observe(()->student);
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return Observation.createNotStarted("getAllStudents", observationRegistry).observe(()->studentlist);
	}

	public Student getStudentById(String id) {
		// TODO Auto-generated method stub
		
		
		
		
		return Observation.createNotStarted("getStudentById", observationRegistry).observe(()->studentlist.stream().filter(stud->stud.id().equals(id)).findFirst()
				.orElseThrow(()->new RuntimeException("Student Not found")));
	}
	
	
	
}
