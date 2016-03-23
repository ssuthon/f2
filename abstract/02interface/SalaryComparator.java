import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2){
		return new Double(e1.getSalary()).compareTo(e2.getSalary());
	}
}