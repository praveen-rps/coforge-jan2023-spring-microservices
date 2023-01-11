package springexamples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("local")
public class LocalConfiguration {
	
	@Bean
	public Address getAddress() {
		return new Address(101,"MG Road","Bangalore");
	}
	
	@Bean
	public Employee getEmployee() {
		return new Employee(901,"Kumar","Fianance");
	}

}
