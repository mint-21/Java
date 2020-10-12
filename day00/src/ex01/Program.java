package ex01;
import java.util.Scanner;

public class Program {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int step = 0;
        boolean flag = true;

        // Проверяем на отрицательные числа и 0
        if (number <= 0) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        // Счет шагов и проверка на простые числа
        for (int i = 1; (i * i) <= number; i++) {
            if (number % i == 0 && i != 1) {
                flag = false;
                break;
            }
            if (number == 2)
                flag = false;
            step++;
        }
        System.out.println(flag + " " + step);
    }
}
