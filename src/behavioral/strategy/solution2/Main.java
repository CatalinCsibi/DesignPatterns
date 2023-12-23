package behavioral.strategy.solution2;

public class Main {

    public static void main(String[] args) {

        var imageStorage = new ImageStorage();

        imageStorage.store("", new PngCompressor(), new RedAndGreenFilter());
    }
}
