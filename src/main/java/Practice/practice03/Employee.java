package Practice.practice03;

public class Employee {
	private String name;
	private int age;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void selfIntroduction() {
		System.out.println("氏名 : " + name);
		System.out.println("年齢 : " + age);
	}
}
