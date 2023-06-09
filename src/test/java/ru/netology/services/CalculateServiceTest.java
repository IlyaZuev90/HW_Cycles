package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateServiceTest {

    @Test
    public void testCalculateLowIncomeLowExpensesLowThreshold() {
        CalculateService service = new CalculateService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
        System.out.println();
        System.out.println("Количество месяцев для отдыха: " + actual);
        System.out.println();
    }

    @Test
    public void testCalculateHighIncomeHighExpensesHighThreshold() {
        CalculateService service = new CalculateService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
        System.out.println();
        System.out.println("Количество месяцев для отдыха: " + actual);
        System.out.println();
    }
}
