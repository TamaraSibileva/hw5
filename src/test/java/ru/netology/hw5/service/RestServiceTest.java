package ru.netology.hw5.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/rest.csv")

    public void testMonthOfRest (int expected, int income, int expense, int threshold) {
        RestService service = new RestService();

        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
