import java.util.Arrays;

public class MarketProvider {
    public void onMarketUpdate(TradingProvider Trade) {
        System.out.println(Arrays.toString(Trade.getList()));
    }


}
