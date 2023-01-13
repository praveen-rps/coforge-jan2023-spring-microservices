package projectaop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAoP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ClassPathXmlApplicationContext context = 
					new ClassPathXmlApplicationContext("beans.xml");
			Customer tc = (Customer) context.getBean("customer");
			//tc.addCustomer();
			//tc.addCustomerAfter();
			//tc.addCustomerThrowException();
			tc.addCustomerReturnValue();
		
		} catch (Exception e) {
			// e.printStackTrace();
		}

	}

}
