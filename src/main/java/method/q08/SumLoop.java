package method.q08;

public class SumLoop {

	public static void main(String[] args) {
		int min = 1;
		int max = 100;
		int totalSum = allSum(min, max);

		System.out.println("最小値 : " + min);
		System.out.println("最大値 : " + max);
		System.out.println("加算結果 : " + totalSum);
	}
	
	public static int allSum(int min, int max) {
		int totalSum = 0;
		for(int i = min; i <= max; i++) {
			totalSum += i;
		}
		return totalSum;
	}
}
