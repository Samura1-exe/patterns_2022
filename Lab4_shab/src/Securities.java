public class Securities {
    private int id;
    private String symbol;
    private int price;
    private int volume;
    private String type;

    public Securities (String symbol, int price, int volume, String type, int id){
        this.symbol = symbol;
        this.price = price;
        this.volume = volume;
        this.type = type;
        this.id = id;
    }


    @Override
    public String toString() {
        return "{" +
                " symbol = " + symbol +
                " price = " + price +
                " volume = " + volume +
                " type = " + type  +
                '}' + '\n';
    }

}
