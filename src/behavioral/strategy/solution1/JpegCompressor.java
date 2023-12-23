package behavioral.strategy.solution1;

public class JpegCompressor implements Compressor{

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using jpeg");
    }
}
