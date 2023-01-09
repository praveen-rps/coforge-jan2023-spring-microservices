package coforgespringcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ApplicationContext context = new 
				ClassPathXmlApplicationContext("beans.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);

	}

}
