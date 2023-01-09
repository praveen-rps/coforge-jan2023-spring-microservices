package coforgespringcore;

import org.springframework.stereotype.Component;


public class Student {
	int htno;
	String name;
	Address address;
	public Student() {
		
	}
	
	public Student(int htno, String name, Address address) {
		super();
		this.htno = htno;
		this.name = name;
		this.address = address;
	}

	public int getHtno() {
		return htno;
	}
	public void setHtno(int htno) {
		this.htno = htno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [htno=" + htno + ", name=" + name + ", address=" + address + "]";
	}
	

}
