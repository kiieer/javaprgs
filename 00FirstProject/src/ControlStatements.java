
public class ControlStatements {
	
public static void main(String[] args) {
	
	// If / Else
	int one = 5;
	if (one > 10) {
		System.out.println("If/Else: Greater than ten.");
	} else {
		System.out.println("If/Else: Less than ten.");
	}
	
	// Switch / Case
	int two = 3;
	switch(two) {
	case 0:
		System.out.println("Switch: 0");
		break;
	case 1:
		System.out.println("Switch: 1");
		break;
	case 2:
		System.out.println("Switch: 2");
	break;
	default: 
		System.out.println("Switch: Greater than two.");
	}
	
	// While
	int three = 3;
	while (three < 5) {
		System.out.println("While: " + three);
		three++;
	}
	
	// Do / While
	int four = 1;
	do {
		System.out.println("Do / While: " + four);
		four++;
	} while (four < 5);
	
	// Enhanced For Loop
	int[] five = {1, 2, 3, 4, 5};
	for (int i : five) {
		System.out.println("Enhanced For: " + i);
	}
	// Break
	for (int a = 0; a < 10; a++) {
		if (a == 2) break;
		System.out.println("Break: Test");
	} System.out.println("Break: Loop Complete.");
	
	// Continue
	for (int a = 0; a < 10; a++) {
		if (a == 2) continue;
		System.out.println("Continue: Test");
	} System.out.println("Continue: Loop Complete.");
	
}
}