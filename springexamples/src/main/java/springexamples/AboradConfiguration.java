package springexamples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("abroad")
public class AboradConfiguration {
	
	
	@Bean
	public Address getAddress() {
		return new Address(32,"StMarks","St Louis");
	}
	
	@Bean
	public Employee getEmployee() {
		return new Employee(1,"Bob","Operations");
	}

}
