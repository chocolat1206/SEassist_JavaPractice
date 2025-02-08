package basic.q07;

public class MultiplicationTable {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int k = 1; k <= 9; k++) {
				System.out.printf("%-3d", i * k);

			}
			System.out.println(); //　行(i)の段が終われば改行する
		}

	}

}
