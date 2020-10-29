package edu.school21.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberWorkerTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 5, 7, 11})
    void isPrimeForPrimes(int isPrime) {
        Assertions.assertTrue(NumberWorker.isPrime(isPrime));
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 15, 20, 100})
    void isPrimeForNotPrimes(int isPrime) {
        Assertions.assertFalse(NumberWorker.isPrime(isPrime));
    }

    @ParameterizedTest
    @ValueSource(ints = {-13, 0, 1, -100})
    void isPrimeForIncorrectNumbers(final int number) {
        Assertions.assertThrows(IllegalNumberException.class, () -> NumberWorker.isPrime(number));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void isDigitSum(int one, int two) {
        Assertions.assertEquals(NumberWorker.digitsSum(one), two);
    }
}
