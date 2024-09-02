package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = sales.length - 1; i >= 0; i--) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int sumSales(long[] sales) {
        int sumSales = 0;

        for (int i = 0; i < sales.length; i++) {
            sumSales = (int) (sumSales + sales[i]);
        }

        return sumSales;
    }

    public double avgSales(long[] sales) {
        double avgSales = 0;
        double sumSales = 0;

        for (int i = 0; i < sales.length; i++) {
            sumSales = (int) (sumSales + sales[i]);
        }
        avgSales = sumSales / sales.length;

        return avgSales;
    }

    public int countLess(long[] sales) {
        double avgSales = avgSales(sales);
        int countLess = 0;

        for (int i = 0; i < sales.length; i++) {
            if (avgSales > sales[i])
                countLess++;

        }
        return countLess;
    }

    public int countMore(long[] sales) {
        double avgSales = avgSales(sales);
        int countMore = 0;

        for (int i = 0; i < sales.length; i++) {
            if (avgSales < sales[i])
                countMore++;
        }
        return countMore;
    }
}

