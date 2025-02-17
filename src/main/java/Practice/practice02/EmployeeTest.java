package Practice.practice02;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();

		employee.setName("山田");
		employee.setAge(20);

		String name = employee.getName();
		int age = employee.getAge();

		System.out.println("氏名 : " + name);
		System.out.println("年齢 : " + age);
	}
}
