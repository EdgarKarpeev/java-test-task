Main.java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ===== ЗАДАНИЕ 1 =====
        System.out.println("=== Задание 1: Работа с числами ===");

        System.out.print("Введите число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        // Сравнение
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Арифметические операции
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));

        if (b != 0) {
            System.out.println("Деление: " + ((double) a / b));
        } else {
            System.out.println("Деление: невозможно (деление на 0)");
        }

        // ===== ЗАДАНИЕ 2 =====
        System.out.println("\n=== Задание 2: Сравнение строк ===");

        scanner.nextLine(); // очистка буфера

        System.out.print("Введите строку a: ");
        String strA = scanner.nextLine();

        System.out.print("Введите строку b: ");
        String strB = scanner.nextLine();

        if (strA.equals(strB)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        // ===== ЗАДАНИЕ 3 =====
        System.out.println("\n=== Задание 3: Чётные числа ===");

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Чётные числа:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
