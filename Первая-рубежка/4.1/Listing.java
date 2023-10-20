public class Listing {
    public static void main(String[] args) {
        // Создаем массив с названиями дней недели
        String[] weekDays = { "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье" };

        // Внешний цикл перебирает дни недели
        for (int weekDay = 0; weekDay < weekDays.length; weekDay++) {
            System.out.print("День недели: " + weekDays[weekDay] + " Часы: ");

            // Создаем объект StringBuilder для накопления значений счетчика часов
            StringBuilder hourString = new StringBuilder();

            // Вложенный цикл перебирает часы внутри текущего дня
            for (int dayHour = 1; dayHour <= 24; dayHour++) {
                hourString.append(dayHour); // Добавляем значение часа в строку

                // Если это не последний час, добавляем запятую и пробел
                if (dayHour < 24) {
                    hourString.append(", ");
                }
            }

            // Выводим строку с часами после завершения вложенного цикла
            System.out.println(hourString.toString());
        }
    }
}
