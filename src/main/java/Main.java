public class Main {
    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calc = new Calculator();

        // Perform calculations and display the results
        int additionResult = calc.add(2, 3);
        int subtractionResult = calc.subtract(5, 3);
        int multiplicationResult = calc.multiply(4, 3);
        int divisionResult = calc.divide(10, 2);
        double powerResult = calc.power(2, 3);

        // Print out the results
        System.out.println("Addition: " + additionResult);      // 5
        System.out.println("Subtraction: " + subtractionResult); // 2
        System.out.println("Multiplication: " + multiplicationResult); // 12
        System.out.println("Division: " +  divisionResult); // 5
    }
}
