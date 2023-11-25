package ru.netology.stats;

public class StatsService {

    public int sumOfAllSales(int[] sales) {
        int sum = 0;
        for (int i : sales) {
            sum += i;
        }
        return sum;
    }

    public int averageSalesPerMonth(int[] sales) {
        return sumOfAllSales(sales) / sales.length;
    }

    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthsBelowAverage(int[] sales) {
        int sum = 0;
        int avg = averageSalesPerMonth(sales);
        for (int i : sales) {
            if (i < avg) {
                sum++;
            }
        }
        return sum;
    }

    public int monthsAboveAverage(int[] sales) {
        int sum = 0;
        int avg = averageSalesPerMonth(sales);
        for (int i : sales) {
            if (i > avg) {
                sum++;
            }
        }
        return sum;
    }
}
