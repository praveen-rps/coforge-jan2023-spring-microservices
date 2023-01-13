package projectaop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configs {
	
	@Bean
	public Customer getCustomer() {
		return new Customer();
	}
}
