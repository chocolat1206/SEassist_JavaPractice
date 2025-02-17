package Practice.practice01;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee name1 = new Employee("山田", 20);
		name1.showInfo();
		
		System.out.println("------------");
		
		Employee name2 = new Employee("鈴木", 30);
		name2.showInfo();
	}

}
