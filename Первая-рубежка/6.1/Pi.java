public class Pi {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Укажите радиус в аргументах командной строки.");
            return; // Завершаем выполнение программы, если не указан радиус.
        }

        float radius = Float.parseFloat(args[0]); // Преобразуем строку аргумента в число с плавающей точкой.
        float shortPi = (float) Math.PI; // Приводим число Пи к типу float.
        float circ = 2 * shortPi * radius; // Для длины окружности используется формула 2 * π * r
        float area = shortPi * radius * radius; // Вычисляем площадь круга.

        System.out.println("Если число Пи рассчитано в диапазоне от " + Math.PI + " до " + shortPi + "...");
        System.out.println("Окружность с радиусом " + radius + " см");
        System.out.println("имеет длину " + circ + " см и площадь " + area + " кв.см");
    }
}
