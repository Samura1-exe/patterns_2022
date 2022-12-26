public class Main {
    public static void main(String[] args) {
        TradingProvider Trade = new TradingProvider();
        MarketProvider Market = new MarketProvider();
        Trade.SendOrder("name1", 100, 10, "покупка");
        Trade.SendOrder("name2", 100, 10, "покупка");
        Trade.SendOrder("name3", 100, 10, "покупка");
        Market.onMarketUpdate(Trade);
        Trade.CancellationOrder(1);
        Market.onMarketUpdate(Trade);

    }
}