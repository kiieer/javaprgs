package my.calculator;

public class MainApp {
public static void main(String[] args) {
    Calculator c=new Calculator();
    
    System.out.println("Adding Two Numbers : " +c.add(2, 2));

    System.out.println("Subtracting two numbers: " + c.subtract(4, 2));
}
}