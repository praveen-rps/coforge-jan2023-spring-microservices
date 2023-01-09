package coforgespringcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaConfigurtions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(StudentConfigurations.class);
		
		Student s1 = (Student) context.getBean("student");
		System.out.println(s1);
		
		Address a1 = (Address) context.getBean("delhi");
		System.out.println(a1);
		
		Address a2 = (Address) context.getBean("vizag");
		System.out.println(a2);

	}

}
