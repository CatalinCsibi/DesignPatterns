package behavioral.observer.example1.pushstyle;

public class DataSource extends Subject {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObserver(value);
    }
}
