import java.util.Scanner;

public class Else {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Справшиваем пользователя ввести значение часов (hrs)
        System.out.print("Введите часы (hrs): ");
        
        // Считываем введенное значение и сохраняем его в переменной hrs
        int hrs = scanner.nextInt();

        // Закрываем объект Scanner, так как он больше не нужен
        scanner.close();

        // Выполняем условные проверки и выводим соответствующее приветствие
        if (hrs < 13) {
            System.out.println("Доброе утро: " + hrs);
        } else if (hrs < 18) {
            System.out.println("Добрый день: " + hrs);
        } else {
            System.out.println("Добрый вечер: " + hrs);
        }
    }
}
