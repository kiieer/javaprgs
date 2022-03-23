
public class MultiplicationTest {

	public static void main(String[] args) {
//		int n1 = 5*4*3*2*1;
//		System.out.println(n1);
		
		int n1 = 6;
		int counter = n1;
		int temp = n1;
		
		while (counter > 2) {
			temp = temp * (n1 - 1);
			n1 = n1 - 1;
			System.out.println(temp);
			counter --;
		}
		
	}	

}
