
public class Calculator {
    
    // Addition method
       public String add(int a, int b) 
       {
           int result = a + b;
           return "Addition: " + a + " + " + b + " = " + result;
       }

       // Subtraction method
       public String subtract(int a, int b) 
       {
           int result = a - b;
           return "Subtraction: " + a + " - " + b + " = " + result;
       }

       // Multiplication method
       public String multiply(int a, int b)
       {
           int result = a * b;
           return "Multiplication: " + a + " * " + b + " = " + result;
       }

       // Division method
       public String divide(int a, int b)
       {
           if (b == 0) {
               throw new IllegalArgumentException("Cannot divide by zero");
           }
           double result = (double) a / b;
           return "Division: " + a + " / " + b + " = " + result;
       }
    
    public static void main(String[] args) 
    {

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 3));
        System.out.println(calculator.subtract(10, 4));
        System.out.println(calculator.multiply(6, 7));
        System.out.println(calculator.divide(15, 3));
    }
}
