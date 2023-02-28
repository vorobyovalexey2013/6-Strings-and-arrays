import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    //Тест сумму всех продаж.
    @Test
    public void shouldSummSales () {
        StatsService service = new StatsService ();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumm = 180;
        int actualSum = service.sumSales(sales);
        Assertions.assertEquals(expectedSumm, actualSum);
    }

    //Тест среднюю сумму продаж в месяц.
    @Test
    public void shouldAverageSummSales () {
        StatsService service = new StatsService ();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageSumm = 15;
        int actualSum = (int) service.averageSumSales(sales);
        Assertions.assertEquals(expectedAverageSumm, actualSum);
    }

    //Тест номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    @Test
    public void shouldMaxSales () {
        StatsService service = new StatsService ();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedmaxSales = 8;
        int actualNum = service.maxSales(sales);
        Assertions.assertEquals(expectedmaxSales, actualNum);
    }


    //Тест Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    @Test
    public void shouldMinSales () {
        StatsService service = new StatsService ();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedminSales = 9;
        int actualNum = service.minSales(sales);
        Assertions.assertEquals(expectedminSales, actualNum);
    }

    //Тест количество месяцев, в которых продажи были ниже среднего
    @Test
    public void shouldminSalesAverge () {
        StatsService service = new StatsService ();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedminSalesAverge = 5;
        int actualNum = service.minSalesAverge(sales);
        Assertions.assertEquals(expectedminSalesAverge, actualNum);
    }

    //Тест количество месяцев, в которых продажи были выше среднего (см. п.2).
    @Test
    public void shouldmaxSalesAverge () {
        StatsService service = new StatsService ();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedmaxSalesAverge = 5;
        int actualNum = service.maxSalesAverge(sales);
        Assertions.assertEquals(expectedmaxSalesAverge, actualNum);
    }
}
