import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();
        Taxi taxi3 = new Taxi();

        Taxi[] mas = new Taxi[3];
        mas[0] = taxi1;
        mas[1] = taxi2;
        mas[2] = taxi3;

        taxi1.setX(Math.random()*100);
        taxi1.setY(Math.random()*100);
        taxi2.setX(Math.random()*100);
        taxi2.setY(Math.random()*100);
        taxi3.setX(Math.random()*100);
        taxi3.setY(Math.random()*100);

        new tracker("такси 1", taxi1);
        new tracker("такси 2", taxi2);
        new tracker("такси 3", taxi3);

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                for (int i = 0; i <= 2; i++){
                    double fir = Math.random();
                    double sec = Math.random();
                    mas[i].switchX(fir);
                    mas[i].switchY(sec);
                    mas[i].setNewsChurch(switchAsd(fir, sec));
                }
            }
        };

        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 10 * 1000);



        try {
            Thread.sleep(150000);

            timer.cancel();
            System.out.println("TimerTask canceled");

            Thread.sleep(300000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static String switchAsd(double f, double s){
        if (f < 0.5){
            f = 0;
        } else f = 1;
        if (s < 0.5){
            s = 0;
        } else s = 1;
        if (s == 0){
            switch ((int)f){
                case 0: return("движется на северо восток");
                case 1: return("движется на северо запад");
            }
        }else
            switch ((int)f){
                case 0: return("движется на юго восток");
                case 1: return("движется на юго запад");
            }
        return null;
    }
}