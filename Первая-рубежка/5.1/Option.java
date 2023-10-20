class Option {
    public static void main(String[] args) {
        if (args.length > 0) {
            if (args[0].equals("-en")) {
                System.out.println("Опция для Английского языка");
            } else if (args[0].equals("-es")) {
                System.out.println("Опция для Испанского языка");
            } else {
                System.out.println("Неизвестная опция");
            }
        } else {
            System.out.println("Не указана опция");
        }
    }
}
