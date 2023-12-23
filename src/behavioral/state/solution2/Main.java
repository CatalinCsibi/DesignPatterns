package behavioral.state.solution2;

public class Main {

    public static void main(String[] args) {

        var workBench = new Workbench();

        workBench.setCurrentTool(new Saw());
        workBench.useTool();

    }
}
