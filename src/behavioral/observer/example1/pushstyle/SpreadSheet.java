package behavioral.observer.example1.pushstyle;

public class SpreadSheet implements Observer {

    @Override
    public void update(int value) {
        System.out.println("SpreadSheet got notified: " + value);
    }
}
