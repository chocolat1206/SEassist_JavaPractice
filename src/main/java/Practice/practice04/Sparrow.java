package Practice.practice04;

public class Sparrow extends Animal {
	private boolean canFly;
	
	public Sparrow(String name, int age, boolean canFly) {
		super(name, age);
		this.canFly = canFly;
	}
	
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
	public boolean getCanFly() {
		return canFly;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		if (canFly) {
			System.out.println("飛べます"); // canFlyがtrueなら表示
		} else {
			System.out.println("飛べません"); // canFlyがfalseなら表示
		}
	}
	
	public void cry() {
		System.out.println("鳴き声 : チュンチュン");
	}
}
