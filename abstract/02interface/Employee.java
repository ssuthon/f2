public class Employee implements Comparable<Employee> {
	private String name;
	private double salary;

	public Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}

	public String getName(){
		return name;
	}

	public void setSalary(double salary){
		this.salary = salary;
	}

	public double getSalary(){
		return salary;
	}

	public String toString(){
		return name + " got " + salary + " a month.";
	}

	public int compareTo(Employee e){
		return name.compareTo(e.name);
	}
}