package Practice.practice04;

public class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name =name;
		this.age =age;
	}
	
	public void setName(String name) {
		this.name = name;
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
	
	public void showInfo() {
		System.out.println("名前 : " + name);
		System.out.println("年齢 : " + age);
	}
}
