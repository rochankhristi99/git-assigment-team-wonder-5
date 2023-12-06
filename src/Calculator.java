
public class Calculator {
    
    // Addition method
       public String add(int a, int b) {
           int result = a + b;
           return "Addition: " + a + " + " + b + " = " + result;
       }

       // Subtraction method
       public String subtract(int a, int b) {
           int result = a - b;
           return "Subtraction: " + a + " - " + b + " = " + result;
       }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 3));
        System.out.println(calculator.subtract(10, 4));
    }
}
