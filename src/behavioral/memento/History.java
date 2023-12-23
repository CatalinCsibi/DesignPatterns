package behavioral.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class History {

    private Stack<EditorState> states = new Stack<>();

    public void push(EditorState state) {
        states.push(state);
    }

    public EditorState pop() {
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.pop();

        return lastState;
    }


}
