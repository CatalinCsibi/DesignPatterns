package behavioral.strategy.solution2;

public class PngCompressor implements Compressor{

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing PNG");
    }
}
