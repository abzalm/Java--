import java.util.Scanner;

public class TriangleS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сторону a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите сторону b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите сторону c: ");
        double c = scanner.nextDouble();

        // Проверка на возможность существования треугольника
        if (a + b > c && a + c > b && b + c > a) {
            // Вычисляем полупериметр
            double p = (a + b + c) / 2;

            // Вычисляем площадь по формуле Герона
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            System.out.println("Площадь треугольника: " + area);
        } else {
            System.out.println("Треугольник с такими сторонами не может существовать.");
        }
    }
}
