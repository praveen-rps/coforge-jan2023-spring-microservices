package coforgespringcore;

public class Employee {
	int empid;
	String name;
	String dept;
	
	public Employee() {
		
	}

	public Employee(int empid, String name, String dept) {
		super();
		this.empid = empid;
		this.name = name;
		this.dept = dept;
	}

	public int getEmpid() {
		return empid;
	}

	

	public String getName() {
		return name;
	}

	

	public String getDept() {
		return dept;
	}

	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", dept=" + dept + "]";
	}
	
	

}
