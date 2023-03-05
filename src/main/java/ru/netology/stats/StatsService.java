package ru.netology.stats;

public class StatsService {

    //Сумму всех продаж.
    public long sumSales(long[] sales) {
        long sumSales = 0;
        for (long i : sales) {
            sumSales = sumSales + i;
        }
        return (int) sumSales;
    }

    //Среднюю сумму продаж в месяц.
    public long averageSumSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    //Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*
    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1;
    }

    //Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*.
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1;
    }

    //Количество месяцев, в которых продажи были ниже среднего (см. п.2).
    public long minSalesAverge(long[] sales) {
        int minSalesAverge = 0;
        long averagesumSales = averageSumSales(sales);
        for (int t = 0; t < sales.length; t++) {
            if (sales[t] < averagesumSales) {
                minSalesAverge = minSalesAverge + 1;
            }
        }
        return minSalesAverge;
    }

    //Количество месяцев, в которых продажи были выше среднего (см. п.2).
    public long maxSalesAverge(long[] sales) {
        int maxSalesAverge = 0;
        long averagesumSales = averageSumSales(sales);
        for (int m = 0; m < sales.length; m++) {
            if (sales[m] > averagesumSales) {
                maxSalesAverge = maxSalesAverge + 1;
            }
        }
        return maxSalesAverge;
    }
}