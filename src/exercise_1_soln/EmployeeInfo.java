package exercise_1_soln;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {BYNAME, BYSALARY};
	
	public void sort(List<Employee> emps, final SortMethod method) {
		class EmployeeComparator implements Comparator<Employee> {

			// it was 3:06AM, when I wrote this code, don't judge me
			@Override public int compare(Employee e1, Employee e2) {
				if(method == SortMethod.BYNAME) {
					if(e1.name.compareTo(e2.name) == 0)
						return e1.salary - e2.salary;
					
					return e1.name.compareTo(e2.name);
				} else {
					if(e1.salary == e2.salary) return 0;
					else if(e1.salary < e2.salary) return -1;
					else return 1;
				}
			}
		}
		Collections.sort(emps, new EmployeeComparator());
	}
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY);
		System.out.println(emps);
		
		String x = "abcd";
		String y = "abcd";
		
		System.out.println(x.compareTo(y));
		
		// The return from String's compareTo method for equality is int value 0
		
		// Example of inequality
		
		emps.add(new Employee("apple", 200));
		emps.add(new Employee("apple", 232420));
				
		System.out.println("\n sort by Name");
		ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
		System.out.println(emps);
		
		System.out.println("\n sort by Salary");
		ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY);
		System.out.println(emps);
			
	}
}