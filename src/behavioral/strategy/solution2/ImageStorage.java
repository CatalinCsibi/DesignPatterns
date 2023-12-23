package behavioral.strategy.solution2;

public class ImageStorage {

    public void store(String fileName, Compressor compressor, Filter filter) {
        compressor.compress(fileName);
        filter.apply(fileName);

    }
}
