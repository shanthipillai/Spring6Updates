package spring6.client.student.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import spring6.client.student.service.StudentClientService;

@Configuration
public class StudentClientConfig {


	@Bean
	
	public WebClient studentServiceWebClient()
	{
		return WebClient.builder().baseUrl("http://localhost:8080")
				.build();
			 
	}
	
	@Bean
	public StudentClientService studentClientService()
	{
		
		
		HttpServiceProxyFactory httpServiceProxyFactory=HttpServiceProxyFactory
				.builderFor(WebClientAdapter.create(studentServiceWebClient()))
				.build();
		return httpServiceProxyFactory.createClient(StudentClientService.class);
				
				
	}
	
}
