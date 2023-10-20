class Switch {
    public static void main(String[] args) {
        int month = 2, year = 2016, num = 31;
        // Используем оператор switch для выбора количества дней в месяце
        switch (month) {
            case 4: case 6: case 9: case 11:
            // Если месяц - апрель, июнь, сентябрь или ноябрь, устанавливаем num в 30
                num = 30;
                break;
            case 2:
            // Если месяц - февраль, используем условный оператор для определения високосного года
                num = (year % 4 == 0) ? 29 : 28;
                break;
        }
        // Выводим результат в формате "месяц/год: количество дней"
        System.out.println(month + "/" + year + ": " + num + " дней");
    }
}