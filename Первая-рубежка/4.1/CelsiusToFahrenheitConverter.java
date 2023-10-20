import java.util.Scanner;

public class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите градусы в Цельсиях: ");
        
        if (scanner.hasNextDouble()) {
            double celsius = scanner.nextDouble();
            double fahrenheit = (9.0 / 5.0) * celsius + 32;
            
            System.out.printf("%.1f градусов Цельсия это %.1f градусов Фаренгейта.%n", celsius, fahrenheit);
        } else {
            System.out.println("Некорректный ввод. Пожалуйста, введите число в градусах Цельсия.");
        }
        
        scanner.close();
    }
}
