package com.emp;

public class InstanceVariable
{
	//this instance variable is public which is visible in all child class
	public String empName;
	//this instance variable is private which is visible only in employee2 class
	private double salary;
	public static String companyName;

	public InstanceVariable(String empName,double salary){
		this.empName = empName;
		this.salary = salary;
	
	}
	public static void main(String args[])
	{
		InstanceVariable e2 = new InstanceVariable("Shivansh" ,10000);
		//Employee2 e3 = new Employee2("Satvik" ,20,000 ,"Cap");
		InstanceVariable.companyName = "Capgemini";
		System.out.println("Employee e2 details are:-" +e2.empName +e2.salary +InstanceVariable.companyName);
		//System.out.println("Employee e3 details are :-" +e3.empName +e3.salary +e3.companyName);
	}
}
