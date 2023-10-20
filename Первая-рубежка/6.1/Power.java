public class Power {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Укажите число в аргументах командной строки.");
            return; // Завершаем выполнение программы, если не указано число.
        }

        int num = Integer.parseInt(args[0]);
        int square = (int) Math.pow(num, 2);
        int cube = (int) Math.pow(num, 3);
        double sqrt = Math.sqrt(num); // Для квадратного корня используем тип double.
        
        System.out.println(num + " в квадрате равно " + square);
        System.out.println(num + " в кубе равно " + cube);
        System.out.println("Квадратный корень из " + num + " равен " + sqrt);
    }
}