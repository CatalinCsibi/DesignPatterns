package behavioral.strategy.solution2;

public class JpegCompressor implements Compressor{

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing jpeg");
    }
}
