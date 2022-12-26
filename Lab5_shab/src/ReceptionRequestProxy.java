public class ReceptionRequestProxy extends ReceptionRequest {
    StorageRequest storageRequest = new ReceptionRequest();

    public void startRequest(){
        System.out.println("Начало операции");
    }

    public void endRequest(){
        System.out.println("Завершение операции");
    }
    @Override
    public void doRequest() {
        startRequest();
        storageRequest.doRequest();
        endRequest();
    }
}
