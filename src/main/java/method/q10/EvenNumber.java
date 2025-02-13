package method.q10;

public class EvenNumber {

	public static void main(String[] args) {
		EvenNumber evenNumber = new EvenNumber();
		int[] numbers = {3, 2, 5, 6, 7, 25, 10, 51, 88, 98};
		int evenCount = evenNumber.getEvenNumbers(numbers); 
		//evenCountという変数にevenNumberというこのクラスのgetEvenNumbersメソッドを呼び出して代入している(引数に多重引数)
        System.out.println(java.util.Arrays.toString(numbers) + "には、偶数が" + evenCount + "個あります。");
        // java.util.はArrays クラスが java.util パッケージに属しているため。Arrays.toString(numbers)は配列の要素を視覚的に表示する。
	}
	
	public int getEvenNumbers(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
