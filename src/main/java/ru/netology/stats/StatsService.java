package ru.netology.stats;

public class StatsService {

    //номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //номер месяца, в котором был максимум продаж, то есть осуществлены продажи на минимальную сумму
    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    //сумма всех продаж;
    public int allSalesSum(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }

        return sum;
    }

    //средняя сумма продаж в месяц
    public int meanOfAllSales(int[] sales) {
        int mean = allSalesSum(sales);
        return mean / sales.length;
    }

    //количество месяцев, в которых продажи были выше среднего
    public int aboveMeanOfAllSales(int[] sales) {
        int mean = meanOfAllSales(sales);
        int above = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > mean) above++;
        }
        return above;
    }

    //количество месяцев, в которых продажи были ниже среднего
    public int underMeanOfAllSales(int[] sales) {
        int mean = meanOfAllSales(sales);
        int under = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < mean) under++;
        }
        return under;
    }
}
