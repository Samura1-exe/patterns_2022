public class tracker implements Observer{
    private final String name;

    public tracker(String name, Observable o){
        this.name = name;
        o.registerObserver(this);
    }


    @Override
    public void update(String news, double x, double y) {
        System.out.println(name+ " " + news + " ш" + (int)x + " д" + (int)y);
    }
}