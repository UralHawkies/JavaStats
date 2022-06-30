package ru.netology.Stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMinSales = 9;
        long actualMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);


    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxSales = 8;
        long actualMaxSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void shouldFindAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAllSales = 180;
        long actualAllSales = service.allSales(sales);

        Assertions.assertEquals(expectedAllSales, actualAllSales);
    }

    @Test
    public void shouldFindAverageSalesPerMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverageSalesPerMonth = 15;
        long actualAverageSalesPerMonth = service.averageSales(sales);

        Assertions.assertEquals(expectedAverageSalesPerMonth, actualAverageSalesPerMonth);
    }

    @Test
    public void shouldFindLessThanAverageMonths() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmountLessThanAverage = 5;
        long actualAmountLessThanAverage = service.lessThanAverageSales(sales);

        Assertions.assertEquals(expectedAmountLessThanAverage, actualAmountLessThanAverage);
    }

    @Test
    public void shouldFindMoreThanAverageMonths() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmountMoreThanAverage = 5;
        long actualAmountMoreThanAverage = service.moreThanAverageSales(sales);

        Assertions.assertEquals(expectedAmountMoreThanAverage, actualAmountMoreThanAverage);
    }

}
