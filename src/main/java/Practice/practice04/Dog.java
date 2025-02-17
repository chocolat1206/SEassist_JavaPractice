package Practice.practice04;

public class Dog extends Animal {
	private String futColor;
	
	public Dog(String name, int age, String futColor) {
		super(name, age); // Animalクラスのコンストラクタを呼び出す
		this.futColor = futColor;
	}
	
	public void setFutColor(String futColor) {
		this.futColor = futColor;
	}
	
	public String getFutColor() {
		return futColor;
	}
	
	@Override
	public void showInfo() {
		super.showInfo(); // AnimalクラスのshowInfoメソッドを呼び出す
		System.out.println("毛の色 : " + futColor);
	}
	
	public void cry() {
		System.out.println("鳴き声 : ワン");
	}
}
