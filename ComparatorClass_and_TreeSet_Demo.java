//Assignment 9.4

//Create a class called Employee with attributes: name, designation, and salary. 
//Insert employee objects into the TreeSet where default natural sorting order is
//ascending order of salaries. If two employees have the same salary then consider 
//alphabetical orders of their names, and Write a comparator class to define customized 
//sorting which is the alphabetical order of employee names. If two employees have the 
//same name then consider designation for comparison.

package assignment_9_4;

/*
 * This Assignment helped me to master the concepts of Comparator class and treeset.
 */
import java.util.*;       //importing all classes from java's util library.. Because it has Collection Class needed for this Assignment.
public class ComparatorClass_and_TreeSet_Demo {
	

		public static void main(String[] args)     //main function declaration. and because it is static, program execution starts from main function. 
		{
			//Creating the object of TreeSet and in the constructor, we are passing the object of the SortEmployees class.
			TreeSet<Employee> treeSetObject = new TreeSet<Employee>(new SortEmployees());
			
			//Now we will add the objects of Employee class into treeSetObject.
			treeSetObject.add(new Employee("Rukmini", 3, 200000));
			treeSetObject.add(new Employee("Rakamma", 1, 400000));
			treeSetObject.add(new Employee("Mohini", 2, 120000));
			treeSetObject.add(new Employee("Ashutosh", 2, 400000));
			treeSetObject.add(new Employee("Pachuau", 1, 100000));
			treeSetObject.add(new Employee("Rakamma", 2, 200000));
			treeSetObject.add(new Employee("Ashutosh", 1, 300000));
			treeSetObject.add(new Employee("Sembina", 2, 250000));
			treeSetObject.add(new Employee("Sembina", 1, 300000));
			treeSetObject.add(new Employee("Indersen", 1, 450000));
			//Now , it is the property of TreeSet that objects inside it will be in sorted automatically.
			//Now we will print the objects inside treeSetObject.
			//We will use for each loop for that.
			for(Employee tempObject : treeSetObject)
				System.out.println(tempObject);     //Printing the information about Employee.
		}   //End of main function.
}
