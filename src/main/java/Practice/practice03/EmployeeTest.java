package Practice.practice03;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee("山田", 20); // イメージとしてEmployeeクラス内容をemployeeという変数にコピーして引数を渡すって感じ
		employee.selfIntroduction();
	}
}
