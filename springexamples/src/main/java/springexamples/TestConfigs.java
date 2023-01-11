package springexamples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfigs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext 
		context = new AnnotationConfigApplicationContext(DbConfigs.class);
		
		DbService service = (DbService) context.getBean(DbService.class);
		System.out.println(service.getDataConnection());
		

	}

}
