package org.example;

import ru.netology.stats.javaqa6.service.StatsService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {150, 9, 100, 120, 4, 126, 89, 15, 126, 4, 89, 18};

        System.out.println(service.sumSales(sales));
        System.out.println(service.averageSumSales(sales));
        System.out.println(service.maxSales(sales));
        System.out.println(service.minSales(sales));
        System.out.println(service.countMonthLessAverage(sales));
        System.out.println(service.countMonthMoreAverage(sales));

    }
}