import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        // Ввод данных и создание объектов классов операций
        Scanner scanner = new Scanner(System.in);
        ArithmeticOperations arithmetic = new ArithmeticOperations();
        AdvancedOperations advanced = new AdvancedOperations();

        // Выбор операции
        System.out.println("Choose operation: 1 - Add, 2 - Subtract, 3 - Multiply, 4 - Divide, 5 - Power, 6 - Sqrt");
        int choice = scanner.nextInt();

        // Вызов класса для выполнения операции
        OperationPerformer performer = new OperationPerformer();
        performer.performOperation(choice, scanner, arithmetic, advanced);
    }
}
