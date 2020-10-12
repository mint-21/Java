package ex02;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        long number = 0;
        int step = 0;
        boolean flag;
        int sum;

        while (number >= 0) {
            Scanner scan = new Scanner(System.in);
            number = scan.nextInt();

            if (number == 42)
                break;

            flag = false;
            sum = 0;

            // Считаем сумму цифр в числе
            while (number / 10 != 0) {
                sum += number % 10;
                number = number / 10;
            }
            sum += number % 10;

            // Проверяем на простое число
            for (int i = 1; (i * i) <= sum; i++) {
                if (sum % i == 0 && i != 1 || sum == 2) {
                    flag = true;
                    break;
                }
            }

            // Считаем количество простых чисел
            if (flag == false)
                step++;
        }
        System.out.println("Count of coffee-request - " + step);
    }
}
