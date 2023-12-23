package behavioral.state.solution1;

public class Canvas {

    private Tool currentTool;

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}