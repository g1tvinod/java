public class Employee {
	
	int id;
	String name;
	double salary;
	int exp;

	//default constructor
	public Employee() {
	}

	//constructor with args
	//parameterized constructor
	public Employee(int id, String name, double salary, int exp) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", exp=" + exp + "]";
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"bharat",25000,10);
		System.out.println(e1);
		
		Employee e2 = new Employee();
		System.out.println(e2);			
	}

}
