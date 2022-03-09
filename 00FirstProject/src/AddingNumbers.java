
public class AddingNumbers {
	public static void main(String[] args) {
			System.out.println(sum (5, 1));
			System.out.println(sum (5, 1, 3));
}
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static int sum(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		return sum;
	}
}
