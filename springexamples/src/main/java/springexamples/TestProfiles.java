package springexamples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestProfiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext 
		context = new AnnotationConfigApplicationContext(TestConfigurations.class);
		
		Address address = context.getBean(Address.class);
		System.out.println(address);
		
		Employee employee =(Employee) context.getBean(Employee.class);
		System.out.println(employee);

	}

}
