import java.util.Scanner;

public class CountingLegs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество кур: ");
        int chickens = scanner.nextInt();
        System.out.print("Введите количество коров: ");
        int cows = scanner.nextInt();
        System.out.print("Введите количество свиней: ");
        int pigs = scanner.nextInt();

        int totalLegs = chickens * 2 + cows * 4 + pigs * 4;
        System.out.println("Общее количество ног у всех животных на ферме: " + totalLegs);
    }
}
