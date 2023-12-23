package behavioral.strategy.solution2;

public class RedAndGreenFilter implements Filter{

    @Override
    public void apply(String fileName) {
        System.out.println("Applying Red and Green filter");
    }
}
