package behavioral.mediator.solution1;

public class UIControl {

    protected DialogBox owner;

    public UIControl(DialogBox owner) {
        this.owner = owner;
    }
}
