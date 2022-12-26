import java.util.ArrayList;
import java.util.List;

public class Taxi implements Observable{
    private final List<Observer> parishioners = new ArrayList<>();
    private String newsChurch;
    private double x, y;
    public static int len;
    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }
    public void setNewsChurch(String news) {
        this.newsChurch = news;
        notifyObservers();
    }

    public void registerObserver(Observer o) {
        parishioners.add(o);
        len++;
    }

    public void removeObserver(Observer o) {
        parishioners.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : parishioners)
            o.update(newsChurch, x, y);
    }



    public void switchX(double x) {
        if (x < 0.5){
            x = 0;
        } else x = 1;
        switch ((int) x) {
            case 0 -> this.x += 2;
            case 1 -> this.x -= 2;
        }
    }

    public void switchY(double y) {
        if (y < 0.5){
            y = 0;
        } else y = 1;
        switch ((int) y) {
            case 0 -> this.y += 2;
            case 1 -> this.y -= 2;
        }
    }
}
