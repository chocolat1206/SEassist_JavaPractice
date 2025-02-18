package Practice.practice04;

public class AnimalTest {

	public static void main(String[] args) {
		Dog dog = new Dog("ポチ", 2, "白");
		Sparrow sparrow = new Sparrow("チュン", 1, true);
		
		dog.showInfo();
		dog.cry();
		
		System.out.println("--------------------");
		
		sparrow.showInfo();
		sparrow.cry();
	}

}
