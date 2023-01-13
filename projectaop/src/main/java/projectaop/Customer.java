package projectaop;

public class Customer {
	
		
	public void addCustomer() {
		System.out.println("addCustomer() is running ");
	}

	public void addCustomerAfter() {
		System.out.println("addCustomerAfter() is running ");
	}

	
	public String addCustomerReturnValue() {
		System.out.println("addCustomerReturnValue() is running ");
		return "AOP is working..";
	}

	
	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is running ");
		throw new Exception("Generic Error");
	}

	public void addCustomerAround(String name) {
		System.out.println("addCustomerAround() is running, args : " + name);
	}
	
}
