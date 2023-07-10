package ru.netology.stats.javaqa6.service;

public class StatsService {

    public long sumSales(long[] sales){
        long amount = 0;
        for (int i = 0; i < sales.length; i++){
            amount = amount + sales[i];
        }
        return amount;
    }

    public long averageSumSales(long[] sales){
        long average = 0;
        for (int i = 0; i < sales.length; i++){
            average = average + sales[i];
        }
        return average / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public long countMonthLessAverage(long[] sales){
        long average = averageSumSales(sales);
        int sumMonth = 0;

        for (int i = 0; i < sales.length; i++){
            if (sales[i] < average) {
                sumMonth++;
            }
        }
        return sumMonth;
    }

    public long countMonthMoreAverage(long[] sales){
        long average = averageSumSales(sales);
        int sumMonth = 0;

        for (int i = 0; i < sales.length; i++){
            if (sales[i] > average) {
                sumMonth++;
            }
        }
        return sumMonth;
    }
}

