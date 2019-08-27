package com.kaytec;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 12);
        stockList.addStock(temp);

        temp = new StockItem("cake", 2.39, 1);
        stockList.addStock(temp);

        temp = new StockItem("car", 2000.0, 1);
        stockList.addStock(temp);

        temp = new StockItem("chair", 197.98, 2);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 20);
        stockList.addStock(temp);
        // this one will override previous entry, no dups allowed in our implementation
        temp = new StockItem("cup", 0.60, 30);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 5);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 10);
        stockList.addStock(temp);

        System.out.println(stockList);

    }
}
