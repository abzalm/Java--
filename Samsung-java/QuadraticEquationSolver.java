import java.util.Scanner;

public class QuadraticEquationSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите коэффициент a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите коэффициент b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите коэффициент c: ");
        double c = scanner.nextDouble();

        // Вычисляем дискриминант
        double discriminant = b * b - 4 * a * c;

        // Проверяем значение дискриминанта
        if (discriminant > 0) {
            // Находим два действительных корня
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корни уравнения:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminant == 0) {
            // Один действительный корень
            double x = -b / (2 * a);
            System.out.println("Уравнение имеет один корень:");
            System.out.println("x = " + x);
        } else {
            // Отрицательный дискриминант, вычисляем комплексные корни
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Корни уравнения с комплексными числами:");
            System.out.println("x1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("x2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
