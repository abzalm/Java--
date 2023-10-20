import java.util.Scanner;

public class PrintTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк в таблице: ");
        int n = scanner.nextInt();

        // Создаем массивы для хранения значений a, b и pow(a, b)
        int[] a = new int[n];
        int[] b = new int[n];
        int[] pow = new int[n];

        // Вводим значения a и b
        for (int i = 0; i < n; i++) {
            System.out.print("Введите a" + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Введите целое число!");
                scanner.next();
            }
            a[i] = scanner.nextInt();
            System.out.print("Введите b" + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Введите целое число!");
                scanner.next();
            }
            b[i] = scanner.nextInt();
        }

        // Вычисляем pow(a, b)
        for (int i = 0; i < n; i++) {
            pow[i] = (int) Math.floor(Math.pow(a[i], b[i]));
        }

        // Выводим таблицу
        System.out.printf("a\tb\tpow(a, b)\n");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\n", a[i], b[i], pow[i]);
        }
    }
}
