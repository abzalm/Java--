class Label {
    public static void main(String[] args) {
        outerLoop: for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                // Проверяем условие: если i равно 1 и j равно 1
                if (i == 1 && j == 1) {
                    // Выводим сообщение и переходим к следующей итерации внешнего цикла
                    System.out.println("outerLoop продолжает работу при i=" + i + " j=" + j);
                    continue outerLoop;
                }
                // Проверяем условие: если i равно 2 и j равно 3
                if (i == 2 && j == 3) {
                    // Выводим сообщение и выходим из внешнего цикла
                    System.out.println("Выход из outerLoop при i=" + i + " j=" + j);
                    break outerLoop;
                }
                // Выводим информацию о текущей итерации
                System.out.println("Итерация i=" + i + " j=" + j);
            }
        }
    }
}