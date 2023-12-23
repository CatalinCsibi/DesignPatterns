package behavioral.state.solution1;

public class Main {

    public static void main(String[] args) {
        var canvas = new Canvas();

        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
