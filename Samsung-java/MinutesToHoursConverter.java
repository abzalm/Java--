import java.util.Scanner;

public class MinutesToHoursConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество минут: ");
        int totalMinutes = scanner.nextInt();
        int hours = totalMinutes / 60;
        int remainingMinutes = totalMinutes % 60;

        // Вызываем функцию для склонения слова "час"
        String hourWord = getCorrectHourForm(hours);

        System.out.println(totalMinutes + " минут это " + hours + " " + hourWord + " и " + remainingMinutes + " минут");
    }

    // Функция для правильного склонения слова "час"
    public static String getCorrectHourForm(int hours) {
        if (hours % 10 == 1 && hours % 100 != 11) {
            return "час";  // 1 час, 21 час и т.д.
        } else if (hours % 10 >= 2 && hours % 10 <= 4 && (hours % 100 < 10 || hours % 100 >= 20)) {
            return "часа";  // 2-4 часа, 22-24 часа и т.д.
        } else {
            return "часов";  // Для остальных случаев
        }
    }
}
