class Break {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i == 2 && j == 1) {
                    System.out.println("Выход из внутреннего цикла при i=" + i + " j=" + j);
                    break; // Оператор break для выхода из внутреннего цикла.
                }
                if (i == 1 && j == 1) {
                    System.out.println("Продолжение работы внутреннего цикла при i=" + i + " j=" + j);
                    continue; // Оператор continue для пропуска первой итерации внутреннего цикла.
                }
                System.out.println("Итерация i=" + i + " j=" + j);
            }
        }
    }
}