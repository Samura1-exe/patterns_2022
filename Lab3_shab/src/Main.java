public class Main {
    public static void main(String[] args) {
        PropertyList list = new PropertyList();
        list.add("mail.host.protocol");
        list.add("mail.host.url");
        list.add("mail.host.url.port");
        list.add("mail.username");
        list.showList();
    }
}