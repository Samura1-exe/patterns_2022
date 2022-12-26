public class Storage {
    private StorageRequest storageRequest = new ReceptionRequestProxy();

    public void printRequest(){
        storageRequest.doRequest();
    }
}
