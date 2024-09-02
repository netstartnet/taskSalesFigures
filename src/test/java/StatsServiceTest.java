import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void minMonths() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonths = 9;
        int actualMinMonths = service.minSales(sales);

        Assertions.assertEquals(expectedMinMonths, actualMinMonths);
    }

    @Test
    public void maxMonths() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonths = 8;
        int actualMaxMonths = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonths, actualMaxMonths);
    }

    @Test
    public void sumSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumSales = 180;
        int actualSumSales = service.sumSales(sales);

        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    @Test
    public void avgSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expectedAvgSales = 15;
        double actualAvgSales = service.avgSales(sales);

        Assertions.assertEquals(expectedAvgSales, actualAvgSales);
    }

    @Test
    public void countLess() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expectedCountLess = 5;
        double actualCountLess = service.countLess(sales);

        Assertions.assertEquals(expectedCountLess, actualCountLess);
    }

    @Test
    public void countMore() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expectedCountMore = 5;
        double actualCountMore = service.countMore(sales);

        Assertions.assertEquals(expectedCountMore, actualCountMore);
    }
}

