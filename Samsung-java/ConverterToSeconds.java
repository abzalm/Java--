import java.util.Scanner;

public class ConverterToSeconds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество часов: ");
        int hours = scanner.nextInt();
        System.out.print("Введите количество минут: ");
        int minutes = scanner.nextInt();

        int hoursToSeconds = hours * 3600;
        int minutesToSeconds = minutes * 60;
        int totalSeconds = hoursToSeconds + minutesToSeconds;

        System.out.println("Общее количество секунд: " + totalSeconds);
    }
}
