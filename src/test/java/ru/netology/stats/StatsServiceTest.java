package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalculateMinSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 9;
        long actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldCalculateMaxSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonth = 8;
        long actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldCalculateAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 180;
        int actualSales = service.allSalesSum(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouldCalculateMeanOfAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMean = 15;
        int actualMean = service.meanOfAllSales(sales);

        Assertions.assertEquals(expectedMean, actualMean);
    }

    @Test
    public void shouldFindMonthWithMeanAboveOfAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAboveMean = 5;
        int actualAboveMean = service.aboveMeanOfAllSales(sales);

        Assertions.assertEquals(expectedAboveMean, actualAboveMean);
    }

    @Test
    public void shouldFindMonthWithMeanUnderOfAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedUnderMean = 5;
        int actualUnderMean = service.aboveMeanOfAllSales(sales);

        Assertions.assertEquals(expectedUnderMean, actualUnderMean);
    }
}
