import java.util.ArrayList;

public class TradingProvider {
    private int id = 0;
    Securities[] SecuritiesList = new Securities[100];

    public Securities[] getList() {
        return this.SecuritiesList;
    }

    public void SendOrder(String symbol, int price, int volume, String type){
        if (type == "покупка" || type =="продажа") {
            System.out.println(id);
            SecuritiesList[id] = new Securities(symbol, price, volume, type, id);
            id = id + 1;
        }
        else System.out.println("Неправильный тип операции");
    }

    public void CancellationOrder(int id){
        SecuritiesList[id] = null;
    }

}
