
public class AssignmentFour {
public static void main(String[] args) {
	
	Addition(3, 2);
	Subtraction(3, 10);
	Multiplication(4, 6);
	Division(100, 10);
	
}
	public static void Addition(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("Addition: " + sum);
	}
	public static void Subtraction(int n1, int n2) {
		int sum = n1 - n2;
		System.out.println("Subtraction: " + sum);
	}
	public static void Multiplication(int n1, int n2) {
		int sum = n1 * n2;
		System.out.println("Multiplication: " + sum);
	}
	public static void Division(int n1, int n2) {
		int sum = n1 / n2;
		System.out.println("Division: " + sum);
	}

}
