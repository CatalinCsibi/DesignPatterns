package behavioral.mediator.solution1;

public class ArticlesDialogBox extends  DialogBox{

    private ListBox articlesListBox = new ListBox(this);
    private TextBox tilesTextBox = new TextBox(this);
    private Button saveButton = new Button(this);


    public void simulateUserInteraction() {
        articlesListBox.setSelection("Article 1");
        tilesTextBox.setContent("");
        tilesTextBox.setContent("Article 2");
        System.out.println("TextBox: " + tilesTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
    }

    @Override
    public void changed(UIControl control) {
        if(control == articlesListBox)
            articlesSelected();
        else if (control == tilesTextBox)
            titleChanged();
    }

    private void articlesSelected() {
        tilesTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void titleChanged() {
        var content = tilesTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }
}
