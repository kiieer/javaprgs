
public class AssignmentTwo {
public static void main(String[] args) {
	int one = 10;
	int two = 5;
	Alter(one, two);
}
	public static void Alter(int one, int two) {
	int sum = one + two;
	int sub = one - two;
	int mup = one * two;
	int div = one / two;
	
	System.out.println("Sum: " + sum);
	System.out.println("Sub: " + sub);
	System.out.println("Mup: " + mup);
	System.out.println("Div: " + div);
	}
}
