package behavioral.state.solution1;

public class EraserTool implements Tool{

    @Override
    public void mouseUp() {
        System.out.println("Erase something");
    }

    @Override
    public void mouseDown() {
        System.out.println("Eraser icon");

    }
}
