import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int y = new Scanner(System.in).nextInt();
        System.out.println("Сумма ваших чисел: " + (x+y));
        System.out.println("Разность ваших чисел: " + (x-y));
        System.out.println("Произведение ваших чисел: " + (x*y));
        System.out.println("Частное ваших чисел: " + ((double)(x)/y));
    }
}
