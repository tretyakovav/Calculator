import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1;
        double number2;
        double equally;
        char operand;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа");
        number1 = scan.nextDouble();
        number2 = scan.nextDouble();
        System.out.println("Теперь выберите, что хотите сделать с числами +,-,*,/");
        operand = scan.next().charAt(0);
        switch (operand) {
            case '+' : equally = number1 + number2;
                break;
            case '*' : equally = number1 * number2;
                break;
            case '/' : equally = number1 / number2;
                break;
            case '-' : equally = number1 - number2;
                break;
            default:
                System.out.println("Ошибка");
                return; }
        System.out.println("Ответ " + equally);
    }
}
