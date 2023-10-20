class While {
    public static void main(String[] args) {
        int num = 100;
        // Используем цикл while для создания обратного отсчета
        while (num > 0) {
            // Выводим сообщение о текущем значении num
            System.out.println("Обратный отсчет с использованием While: " + num);
            // Уменьшаем значение num на 10 на каждой итерации
            num -= 10;
        }
    }
}