package ex03;

import java.util.Scanner;

public class Program {
    public static void main(String [] args) {
        int min = 0;
        long rez = 0;
        int step = 1;
        while (true) {
            Scanner scan = new Scanner(System.in);
            String week = scan.next();

            if (week.equals("42"))
                break;

            int numberOfWeek = scan.nextInt();

            if (numberOfWeek != step) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }

            int number1 = scan.nextInt();
            int number2 = scan.nextInt();
            int number3 = scan.nextInt();
            int number4 = scan.nextInt();
            int number5 = scan.nextInt();

            for (int i = 0; i < 10; i++) {
                if (number1 == i || number2 == i || number3 == i || number4 == i || number5 == i) {
                    min = i;
                    break;
                }
            }
            rez = rez * 10 + min;
            step++;
        }
        long reverse = 0;
        while (rez > 0) {
            reverse = reverse * 10 + rez % 10;
            rez /= 10;
        }

        for (int i = 1; i < step; i++) {
            System.out.print("Week " + i + " ");
            rez = reverse % 10;
            while (rez > 0) {
                System.out.print("=");
                rez--;
            }
            reverse /= 10;
            System.out.println(">");
        }
    }
}
