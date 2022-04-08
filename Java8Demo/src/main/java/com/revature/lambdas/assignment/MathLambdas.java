package com.revature.lambdas.assignment;

public class MathLambdas {
	public static void main(String[] args) {
	Math math = (x, y)-> {
		return x + y;
	};
	
	System.out.println(math.add(1, 2));
	System.out.println(math.add(2, 3));
}
}
