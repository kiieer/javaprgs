import java.util.Scanner;
public class ScannerMath {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number: ");
	int n1 = sc.nextInt();
	
	System.out.println("Enter the second number: ");
	int n2 = sc.nextInt();
	
	System.out.println("Addition: " + (n1+n2));
	System.out.println("Subtraction: " + (n1-n2));
	System.out.println("Multiplication: " + (n1*n2));
	System.out.println("Divison: " + (n1/n2));
	System.out.println("Modulus: " + (n1%n2));
	
	sc.close();
}
}
