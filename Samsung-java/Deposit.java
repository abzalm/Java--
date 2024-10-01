import java.util.Scanner;

public class Deposit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальный депозит: ");
        double deposit = scanner.nextDouble();
        System.out.print("Введите процентную ставку (в процентах): ");
        double procent = scanner.nextDouble();
        System.out.print("Введите количество лет: ");
        int years = scanner.nextInt();

        double finalAmount = deposit * Math.pow(1 + procent / 100, years);

        System.out.printf("Сумма на депозите через %d лет: %.2f%n", years, finalAmount);
    }
}
