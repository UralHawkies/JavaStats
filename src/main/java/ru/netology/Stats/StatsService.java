package ru.netology.Stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int allSales(long[] sales) {
        int saleAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            saleAmount += sales[i];
        }
        return saleAmount;
    }

    public int averageSales(long[] sales) {
        int saleAmount = allSales(sales);
        int averageSalesPerMonth = saleAmount / sales.length;

        return averageSalesPerMonth;
    }

    public int lessThanAverageSales(long[] sales) {
        int average = averageSales(sales);
        int lessMonths = 0;
        for (long sale : sales) {
            if (sale < average) {
                lessMonths++;
            }
        }
        return lessMonths;
    }

    public int moreThanAverageSales(long[] sales) {
        int average = averageSales(sales);
        int moreMonths = 0;
        for (long sale : sales) {
            if (sale > average) {
                moreMonths++;
            }
        }
        return  moreMonths;
    }
}
