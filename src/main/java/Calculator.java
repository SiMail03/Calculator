public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calc = new Calculator();

        // Call the methods and print the results
        System.out.println("Addition: " + calc.add(5, 3));        // Example: 5 + 3
        System.out.println("Subtraction: " + calc.subtract(5, 3)); // Example: 5 - 3
        System.out.println("Multiplication: " + calc.multiply(5, 3)); // Example: 5 * 3
    }
}
