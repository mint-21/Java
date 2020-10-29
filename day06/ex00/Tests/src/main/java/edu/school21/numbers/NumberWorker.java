package edu.school21.numbers;

public class NumberWorker {


    public static boolean isPrime(int number) throws IllegalNumberException {
        boolean flag = true;

        if (number <= 1) throw new IllegalNumberException();

        for (int i = 1; (i * i) <= number; i++) {
            if (number % i == 0 && i != 1) {
                flag = false;
                break;
            }
            if (number == 2)
                flag = true;
        }
        return (flag);
    }


    public static int digitsSum(int number) {
        int sum = 0;

        while (number / 10 != 0) {
            sum += number % 10;
            number = number / 10;
        }
        sum += number % 10;

        return (sum);
    }
}
