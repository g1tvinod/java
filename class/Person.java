public class Person {
	
	int id;
	String name;
	String address;
	int age;
	
	public Person() {
	}

	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.id=1;
		p1.name="bharat";
		p1.address="mandya";
		p1.age=25;
		
		System.out.println(p1);
		
		Person p2 = new Person();
		p2.id=2;
		p2.name="bharath";
		p2.address="mandyaaa";
		p2.age=25;
		
		System.out.println(p2);
		
		
	}

}
