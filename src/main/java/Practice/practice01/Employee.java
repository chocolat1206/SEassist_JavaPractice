package Practice.practice01;

public class Employee {
	public String name;
	public int age;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showInfo() {
		System.out.println("氏名 : " + name);
		System.out.println("年齢 : " + age);
	}
}
