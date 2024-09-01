import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача №1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число а: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();
        System.out.println("Результаты вычислений");
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

        //Задача №2

        Random random = new Random();
        int number1 = random.nextInt(1, 55);
        char char1 = (char) number1;
        System.out.print(char1);
        int number2 = random.nextInt(10, 102);
        char char2 = (char) number2;
        System.out.print(char2);
        int number3 = random.nextInt(-10,1000);
        char char3 = (char) number3;
        System.out.print(char3);
        int number4 = random.nextInt();
        char char4 = (char) number4;
        System.out.print(char4);

        //Задача №3

          long longX = 3000000002L;
          int intX = (int) longX;
        System.out.println("\nЧисло типа long : " + longX);
        System.out.println("Число типа int : " + intX);





    }
}