package coforgespringcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfigurations2 {
	
		@Bean("hyderabad")
		public Address returnAddress1() {
			return new Address(111,"Madhapur","Hyderabad");
		}
		
	@Bean("vizag")
	public Address returnAddress2() {
		return new Address(290,"Gajuvaka","Visakhapatnam");
	}

}
