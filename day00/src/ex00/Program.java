package ex00;

public class Program {
    public static void main(String[] args) {
        int number = 479598;

        int a = (number / 100000) % 10;
        int b = (number / 10000) % 10;
        int c = (number / 1000) % 10;
        int d = (number / 100) % 10;
        int f = (number / 10) % 10;
        int g = number % 10;

        System.out.println(a + b + c + d + f + g);
    }
}
