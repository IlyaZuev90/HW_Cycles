package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculateServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/ParameterListForCalculations.csv")
    public void testCalculate(int expected, int income, int expenses, int threshold) {
        CalculateService service = new CalculateService();

        //int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
        System.out.println();
        System.out.println("Количество месяцев для отдыха: " + actual);
        System.out.println();
    }

//    @Test
//    public void testCalculateHighIncomeHighExpensesHighThreshold() {
//        CalculateService service = new CalculateService();
//
//        int expected = 2;
//        int actual = service.calculate(100_000, 60_000, 150_000);
//
//        Assertions.assertEquals(expected, actual);
//        System.out.println();
//        System.out.println("Количество месяцев для отдыха: " + actual);
//        System.out.println();
//    }
}
