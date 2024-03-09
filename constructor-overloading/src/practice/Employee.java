package practice;

public class Employee {

	private int id;
	private String name;

	///same constructors having diffrent arguments is called as consturctor overloading
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Employee() {

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	

}
