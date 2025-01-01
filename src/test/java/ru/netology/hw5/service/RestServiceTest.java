package ru.netology.hw5.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestServiceTest {

    @Test
    public void test3MonthOfRest () {
        RestService service = new RestService();

        int expected = 3;
        int actual = service.calculate(10, 3, 20);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2MonthOfRest () {
        RestService service = new RestService();

        int expected = 2;
        int actual = service.calculate(100, 60, 150);

        Assertions.assertEquals(expected, actual);
    }
}
