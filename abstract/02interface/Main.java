import java.util.*;

public class Main {
	public static void main(String[] args){

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Barry", 30000));
		employees.add(new Employee("Lucifer", 25000));
		employees.add(new Employee("Bones", 40000));
		employees.add(new Employee("Coulson", 20000));

		System.out.println("****** Use default sorting ******");
		Collections.sort(employees);

		for(Employee e : employees){
			System.out.println(e);
		}

		System.out.println("****** Use Salary Comparator ******");
		Collections.sort(employees, new SalaryComparator());
		
		for(Employee e : employees){
			System.out.println(e);
		}
	}
}