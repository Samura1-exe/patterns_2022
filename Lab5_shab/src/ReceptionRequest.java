public class ReceptionRequest implements StorageRequest{

    @Override
    public void doRequest() {
        System.out.println("Запрос товара со склада");
    }
}
