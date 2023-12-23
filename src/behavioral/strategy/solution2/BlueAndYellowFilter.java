package behavioral.strategy.solution2;

public class BlueAndYellowFilter implements Filter{

    @Override
    public void apply(String fileName) {
        System.out.println("Applying Blue and Yellow filter.");
    }
}
