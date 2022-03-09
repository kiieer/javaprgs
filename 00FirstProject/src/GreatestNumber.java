public class GreatestNumber {
	public static void main(String[] args) {
		int n1 = 6;
		int n2 = 5;
		int n3 = 56;
	
		if (n1 > n2 && n1 > n3) {
			System.out.println("Largest number is " + n1);
		} else if (n2 > n3) {
			System.out.println("Largest number is " + n2);
		} else {
			System.out.println("Largest number is " + n3);
		}
}
}
