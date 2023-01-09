package coforgespringcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");	
		
		//Employee employee1 = (Employee) context.getBean("emp1");
		//Employee employee2 = (Employee) context.getBean("emp2");
		Employee employee3 = (Employee) context.getBean("emp3");
	//	System.out.println(employee1);
	//	System.out.println(employee2);
		System.out.println(employee3);

	}

}
