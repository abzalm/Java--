public class StringComparison {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Требуется ввод пароля.");
            return;
        }
        
        String password = "bingo";
        String userInput = args[0].toLowerCase();

        if (userInput.equals(password)) {
            System.out.println("Пароль подтвержден.");
        } else {
            System.out.println("Неверный пароль.");
        }
    }
}