
public class StringAPI {
public static void main(String[] args) {
	String h = "Hello";
	String w = " World!";
	String h2 = "hello";
	
	// Upper & Lower Case
	System.out.println(h.toUpperCase());
	System.out.println(h.toLowerCase());
	
	//Char At
	System.out.println(h.charAt(1));
	
	//Concat
	System.out.println(h.concat(w));
	
	//Equals
	System.out.println(h.equals(h));
	System.out.println(h.equals(w));
	System.out.println(h.equals(h2));
	
	//Equals Ignore Case
	System.out.println(h.equalsIgnoreCase(h2));
	System.out.println(h.equalsIgnoreCase(w));
	
	//Length
	System.out.println(h.length());
	
	//Replace
	System.out.println(h.replace('l', 'w'));
	
	//Trim
	System.out.println(w.trim());
}
}
