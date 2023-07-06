import org.junit.jupiter.api.Test;
import ru.netology.stats.javaqa6.service.StatsService;

public class StatsServiceTest {

    @Test
    public void shouldAmountSales(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 180;
        int actualMonth = service.minSales(sales);
    }

    @Test
    public void shouldAverageAmountSales(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 150;
        int actualMonth = service.minSales(sales);
    }

    @Test
    public void shouldMonthWithMaxSales(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.minSales(sales);
    }

    @Test
    public void shouldMonthWithMinSales(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.maxSales(sales);
    }

    @Test
    public void shouldSumMonthLessAverageSales(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        int actualMonth = service.minSales(sales);
    }

    @Test
    public void shouldSumMonthMoreAverageSales(){
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        int actualMonth = service.minSales(sales);
    }

}
