
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
       
       // Square
       public String square(int a) {
           int result = a * a;
           return "Square of " + a + " = " + result;
       }
       
       // Square root method
       public String squareRoot(double a) {
           if (a < 0) {
               throw new IllegalArgumentException("Cannot find square root of a negative number");
           }
           double result = Math.sqrt(a);
           return "Square root of " + a + " = " + result;
    }
       
       // Exponential method
	    public String exponential(double a, double b) {
	        double result = Math.pow(a, b);
	        return "Exponential: " + a + " raised to the power of " + b + " = " + result;
	    }

	    // Factorial method
	    public String factorial(int n) {
	        if (n < 0) {
	            throw new IllegalArgumentException("Cannot find factorial of a negative number");
	        }
	        int result = 1;
	        StringBuilder factorialString = new StringBuilder("Factorial of " + n + " = ");
	        for (int i = 2; i <= n; i++) {
	            result *= i;
	            if (i != n) {
	                factorialString.append(i).append(" * ");
	            } else {
	                factorialString.append(i);
	            }
	        }
	        factorialString.append(" = ").append(result);
	        return factorialString.toString();
    }
	    
	    // Power method
	    public String power(double base, double exponent) {
	        double result = Math.pow(base, exponent);
	        return "Power of " + base + " raised to the " + exponent + " = " + result;
	    }
	    
	    // Absolute value method
	    public String absoluteValue(int number) {
	        int result = Math.abs(number);
	        return "Absolute Value of " + number + " = " + result;
    }
	    
    public static void main(String[] args) 
    {

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 3));
        System.out.println(calculator.subtract(10, 4));
        System.out.println(calculator.multiply(6, 7));
        System.out.println(calculator.divide(15, 3));
        
        System.out.println(calculator.square(9));
        System.out.println(calculator.squareRoot(25));
        
        System.out.println(calculator.exponential(2, 3));
        System.out.println(calculator.factorial(5));
        
        System.out.println(calculator.power(2, 5));
        System.out.println(calculator.absoluteValue(-10));
    }
}
