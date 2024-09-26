public class AdvancedOperations {

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double sqrt(double a) {
        if (a < 0) {
            throw new ArithmeticException("Square root of negative number is not allowed.");
        }
        return Math.sqrt(a);
    }
}

