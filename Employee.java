//Assignment 9.4

//Create a class called Employee with attributes: name, designation, and salary. 
//Insert employee objects into the TreeSet where default natural sorting order is
//ascending order of salaries. If two employees have the same salary then consider 
//alphabetical orders of their names, and Write a comparator class to define customized 
//sorting which is the alphabetical order of employee names. If two employees have the 
//same name then consider designation for comparison.



package assignment_9_4;

public class Employee {
	public String empName;    //String to store name of Employee.
	public int empDesignation;    //int variable which will be from (1,2 & 3) to specify status of Employee.
	public double empSalary;    //double variable to store the salary of an Employee.
	
	//Constructor.
	public Employee(String empName, int empDesignation, double empSalary) 
	{
		//Initializing instance variable of class by parameters passed in the constructor.
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
	}
	
	//Method to return the information of employee as a String.
	public String toString()
	{
		//returning information as a String.
		return "Name : "+empName+"\nDesignation : "+empDesignation+"\nSalary : "+empSalary+"\n\n";
	}

}
