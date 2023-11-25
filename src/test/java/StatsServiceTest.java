import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void testSumOfAllSales() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.sumOfAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSalesPerMonth() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.averageSalesPerMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSalesMonth() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSalesMonth() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthsBelowAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthsBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthsAboveAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.monthsAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
