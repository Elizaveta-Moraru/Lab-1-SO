import java.util.Scanner;

public class OperationPerformer {

    public void performOperation(int choice, Scanner scanner, ArithmeticOperations arithmetic, AdvancedOperations advanced) {
        double a, b, result = 0;

        switch (choice) {
            case 1:
                System.out.println("Enter two numbers to add:");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                result = arithmetic.add(a, b);
                break;
            case 2:
                System.out.println("Enter two numbers to subtract:");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                result = arithmetic.subtract(a, b);
                break;
            case 3:
                System.out.println("Enter two numbers to multiply:");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                result = arithmetic.multiply(a, b);
                break;
            case 4:
                System.out.println("Enter two numbers to divide:");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                result = advanced.divide(a, b);
                break;
            case 5:
                System.out.println("Enter base and exponent:");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                result = advanced.power(a, b);
                break;
            case 6:
                System.out.println("Enter number to find the square root:");
                a = scanner.nextDouble();
                result = advanced.sqrt(a);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        System.out.println("Result: " + result);
    }
}
