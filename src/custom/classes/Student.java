package custom.classes;

public class Student {
	
	String name;
	int age;
	String address;
	
	public Student (String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return ("Student name is: "+this.getName()+",\nAge is: "+this.getAge()+",\nAnd Address is: "+this.getAddress());
	}
	
	public static void main(String[] args) {
		Student student = new Student("Raynell", 3, "11 Cherrywod");
		
		System.out.println(student.name);
		System.out.println(student.age);
		
		System.out.println(student);
	}

}
