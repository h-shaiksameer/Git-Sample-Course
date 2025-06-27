package tools;
public class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    
  public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        //Calc calculator = new Calc();
        // System.out.println("Addition: " + calculator.add(5, 3));
        // System.out.println("Subtraction: " + calculator.subtract(5, 3));
        // System.out.println("Multiplication: " + calculator.multiply(5, 3));
        // System.out.println("Division: " + calculator.divide(5, 3));
    }
}