import java.util.StringTokenizer;

public class StringBufferBuilder {
public static void main(String[] args) {

	//append
	StringBuffer h = new StringBuffer("Hello");
	h.append(" World!");
	System.out.println(h);
	
	//insert
	h.insert(5, " INSERT");
	System.out.println(h);
	
	//delete char at
	h.deleteCharAt(6);
	System.out.println(h);
	
	//delete
	h.delete(1, 5);
	System.out.println(h);

	
	//set char at
	h.setCharAt(6, 'Y');
	System.out.println(h);
	
	//substring
	System.out.println(h.substring(0, 4));
	
	//reverse
	System.out.println(h.reverse());
	
	//Tokenizer test from Slide
	String friend = "How.Is.Your.Day";
	StringTokenizer tokenizer = new StringTokenizer(friend, ".");
	while(tokenizer.hasMoreTokens()) {
		System.out.println(tokenizer.nextToken());
	}
	
}
}
