package behavioral.state.solution2;

public class Workbench {

    private Tool tool;

    public void useTool(){
        tool.useTool();
    }

    public void setCurrentTool(Tool tool) {
        this.tool = tool;
    }
}
