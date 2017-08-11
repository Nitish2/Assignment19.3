package collectionTreeSet;
/**
 * Creating a class Employee with attributes: name, designation and salary. 
 * Inserting employee objects into the TreeSet where default natural sorting order is ascending order of salaries.
 * Creating a comparator class to define customized sorting which is the alphabetical order of employee names.
*/
public class Employee  implements Comparable<Employee>{ // Creating class Employee as mentioned in the assignment 
	  
	    String name, designation; //Declaring variables
	    float salary;
	   
	    public Employee(String name, String designation, float salary) { //Creating method 
	        super();
	        this.name = name;
	        this.designation = designation;
	        this.salary = salary;
	    }
	    
	    
	    public String getName() { //Get name of the employee
	        return name;          //Return name
	    }
	    
	    public void setName(String name) { //Set name of the employee
	        this.name = name;
	    }
	   
	    public String getDesignation() { //Get Designation of the employee
	        return designation;       //Return Designation
	    }
	    
	    public void setDesignation(String designation) { //Set Designation of the employee
	        this.designation = designation;
	    }
	    
	    public float getSalary() { //Get the salary of the employee
	        return salary;   //Return salary
	    }
	   
	    public void setSalary(float salary) { //Set the salary of the employee
	        this.salary = salary;
	    }
	    //toString() method to return values of the object
	    public String toString(){
	        return "Employee Name: " + name + "\nMonthly Salary: " + salary + "\nDesignation: " +  designation + "\n";        
	    }
	    
	    // Comparing on the basis of salary
	    public int compareTo(Employee e) {
	        if(salary > e.salary){
	            return 1;
	        }else{
	            return -1;
	        }
	    }
	    
	    

	}
