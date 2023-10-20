class For {
    public static void main(String[] args) {
        int num = 0;
        // Внешний цикл - итерируется по переменной i от 1 до 3
        for (int i = 1; i < 4; i++) {
            System.out.println("Внешний цикл i=" + i);
            // Внутренний цикл - итерируется по переменной j от 1 до 3
            for (int j = 1; j < 4; j++) {
                System.out.print("\tВнутренний цикл j=" + j);
                // Увеличиваем значение переменной num на 1 и выводим обновленное значение
                System.out.println("\t\tВсего num=" + (++num));
            }
        }
    }
}