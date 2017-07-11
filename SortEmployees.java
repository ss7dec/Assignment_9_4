//Assignment 9.4

//Create a class called Employee with attributes: name, designation, and salary. 
//Insert employee objects into the TreeSet where default natural sorting order is
//ascending order of salaries. If two employees have the same salary then consider 
//alphabetical orders of their names, and Write a comparator class to define customized 
//sorting which is the alphabetical order of employee names. If two employees have the 
//same name then consider designation for comparison.


package assignment_9_4;

import java.util.*;       //importing all classes from java's util library.. Because it has Collection Class needed for this Assignment.

	public class SortEmployees implements Comparator<Employee>   //class declaration which is extending the class Comparator.
	{
		//This class will be useful to compare two objects of Employee.
		//Method to compare two objects.
		@Override
		public int compare(Employee firstEmployee, Employee secondEmployee) 
		{
			//Checking if salary is firstEmployee is less.
			if(firstEmployee.empSalary < secondEmployee.empSalary)
			{
				return -1;   //return -1.
			}
			//Checking if salary is firstEmployee is more.
			else if(firstEmployee.empSalary > secondEmployee.empSalary)
			{
				return 1;   //return 1;
			}
			//Checking if salary of both employees are same
			else if(firstEmployee.empSalary == secondEmployee.empSalary)
			{
				//We then have to sort based on their names.
				//Checking if names of two employees are not same.
				if(firstEmployee.empName.compareTo(secondEmployee.empName) != 0)
				{
					return firstEmployee.empName.compareTo(secondEmployee.empName);   //returning comparison result of names.
				}
				//If both names are equal
				else if(firstEmployee.empName.compareTo(secondEmployee.empName) == 0)
				{
					//We then have to sort based on their designation.
					//Checking the designation and returning according to that.
					if(firstEmployee.empDesignation < secondEmployee.empDesignation)
						return -1;
					else if(firstEmployee.empDesignation > secondEmployee.empDesignation)
						return 1;
				}
			}
			return 0;
		}

}
