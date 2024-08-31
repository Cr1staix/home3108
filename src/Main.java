//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte isByte = 2;
        short isShort = 1000;
        int isInt = 2000000000;
        long isLong = 20000000000000L;
        float isFloat = 2.4f;
        double isDouble = 2.7;
        char isChar = 'O';
        boolean isBoolean = false;

        int a = 21;
        int b = 7;
        int sum = a + b;
        System.out.println("Сложение : " + sum);
        int dif = a - b;
        System.out.println("Вычитание : " + dif);
        int multiply = a * b;
        System.out.println("Произведение  : " + multiply);
        double division = (double) a / b;
        System.out.println("Деление : " + division);
        int remainder = a % b;
        System.out.println("Деление без остатка : " + remainder);
    }
}