package coforgespringcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("coforgespringcore")
//@Import(StudentConfigurations2.class)
public class StudentConfigurations {
	
	@Bean("chennai")
	public Address returnAddress1() {
		return new Address(999,"T Nagar","Chennai");
	}
	
	@Bean("student")
	public Student returnStudent() {
		return new Student(888,"Alice",returnAddress1());
	}
	
	
	@Bean("delhi")
	public Address returnAddress2() {
		return new Address(1991,"Chanakyapuri","New Delhi");
	}
	

}
