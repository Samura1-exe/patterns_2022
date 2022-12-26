public class Main {
    public static void main(String[] args) {
        AbstractShop latte = new Latte();
        latte.MakeBeverage();

        AbstractShop blackTea = new BlackTea();
        blackTea.MakeBeverage();
    }
}



