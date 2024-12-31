package spring6.springboot3.java817.featurestest.error;

import org.springframework.beans.factory.parsing.Problem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.servlet.http.HttpServlet;

@RestControllerAdvice
public class CustomExceptionHandler {
/*
	@ExceptionHandler(RuntimeException.class)
	public ErrorMessage runTimeException(RuntimeException ex)
	{
		
	}
	
	*/
	
	
	
	@ExceptionHandler(RuntimeException.class)
	public ProblemDetail runTimeException(RuntimeException ex)
	{
		ProblemDetail errormessage=ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, ex.getMessage());
		return errormessage; 
	}
}
