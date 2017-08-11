package collectionTreeSet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class EmployeeData {  //Creating another class
	public static void main(String[] args) { //Main class
		// Creating the object of Employee class
		Employee emp1 = new Employee("Amitab bachchan", "Manager", 80000);
		Employee emp2 = new Employee("Salman khan", "Assistant Manager", 50000);
		Employee emp3 = new Employee("Ranveer singh", "Trainee", 25000);
		Employee emp4 = new Employee("Tiger shroff", "Trainee", 21000);

		/** 
		 *Creating an object of treeSet
		 *TreeSet<> is used to construct an empty tree set that will be sorted in an ascending order 
		   according to the natural order of the tree set.
		 *TreeSet(Comparator)It is used to construct an empty tree set that will be sorted according to given comparator.
		**/
		TreeSet<Employee> empData = new TreeSet<Employee>(
				new ChainedComparator(new NameComp(), new DesignComp()));
		
		// Adding elements into the treeSet
		empData.add(emp1);
		empData.add(emp2);
		empData.add(emp3);
		empData.add(emp4);
		
		for (Employee emplyoee : empData) { //Printing the elements of a treeSet
			System.out.println(emplyoee.toString());
		}
	}

}


class NameComp implements Comparator<Employee> { //Creating NameComp class which implements Comparator interface

	
	
	public int compare(Employee ename1, Employee ename2) { //Creating method 
		// Comparing names and returning the result
		return ename1.getName().compareTo(ename2.getName());
	}

}


class DesignComp implements Comparator<Employee> { //Creates DesignComp which implements Comparator interface


	
	public int compare(Employee ed1, Employee ed2) { //Creating Method 
		// Comparing the designations and returning the result
		return ed1.getDesignation().compareTo(ed2.getDesignation());
	}

}

class SalComp implements Comparator<Employee> { //Creates SalnComp which implements Comparator interface

	
	public int compare(Employee e1, Employee e2) {   //Creating method
		// Comparing the salaries and returning the result
		if (e1.getSalary() > e2.getSalary()) {
			return 1;
		} else {
			return -1;
		}
	}

}

/**
 * ComparatorChain is a Comparator that wraps one or more Comparators in sequence.
 * ComparatorChain calls each Comparator in sequence until any single Comparator returns a non-zero result .
 *
 */
class ChainedComparator implements Comparator<Employee> { //Creates ChainedComparator which implements Comparator interface

	private List<Comparator<Employee>> listComparators; // List Comparator for comparing lists of Comparable objects.


	
	public ChainedComparator(Comparator<Employee>... comparators) {
		this.listComparators = Arrays.asList(comparators); // Giving reference to the object 
	}

	
	public int compare(Employee emp1, Employee emp2) { //Creating method
		for (Comparator<Employee> comparator : listComparators) { // Comparing the objects of a list 
			int compare = comparator.compare(emp1, emp2);
			if (compare != 0) { // If statement 
				return compare; // Returning compare result
			}
		}
		return 0;
	}

}
