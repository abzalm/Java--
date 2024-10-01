import java.util.Scanner;

public class PointsCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество побед: ");
        int wins = scanner.nextInt();
        System.out.print("Введите количество ничьих: ");
        int draws = scanner.nextInt();
        System.out.print("Введите количество поражений: ");
        int losses = scanner.nextInt();

        int totalPoints = wins * 3 + draws * 1 + losses * 0;
        int totalMatches = wins + draws + losses;
        double averagePointsPerMatch = (double) totalPoints / totalMatches;

        System.out.println("Команда набрала: " + totalPoints + " очков.");
        System.out.println("Среднее количество очков за матч: " + averagePointsPerMatch);
    }
}
