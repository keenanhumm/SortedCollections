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

        Basket basket = new Basket("Keenan");

        sellItem(basket, "car", 1);
        System.out.println(basket);

        sellItem(basket, "car", 1);
        sellItem(basket, "hotdog", 1);
        System.out.println(basket);

        sellItem(basket, "juice", 2);
        sellItem(basket, "cup", 20);
        sellItem(basket, "bread", 2);
        System.out.println(basket);

        System.out.println(stockList);


    }
    public static int sellItem(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
