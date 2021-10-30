package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaticServiceTest {

    @Test
    void shouldCalculateSum() {
        StaticService service = new StaticService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSales() {
        StaticService service = new StaticService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSales(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxSalesMonth() {
        StaticService service = new StaticService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;
        int actual = service.findMaxSalesMonth(purchases);

        assertEquals(expected, actual);
    }
    @Test
    void findMinSalesMonth() {
        StaticService service = new StaticService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMinSalesMonth(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findMonthBelowAverage() {
        StaticService service = new StaticService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.qtyMonthBelowAverage(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findMonthOverAverage() {
        StaticService service = new StaticService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.qtyMonthOverAverage(purchases);

        assertEquals(expected, actual);
    }
}