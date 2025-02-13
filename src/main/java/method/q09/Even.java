package method.q09;

public class Even {

	public static void main(String[] args) {
		int num = 5; // 判定したい整数
		
		if (num % 2 == 0) {
			System.out.println(num + "は偶数です。"); // 引数が10の場合
		} else {
			System.out.println(num + "は奇数です。"); // 引数が5の場合
		}
	}
}
