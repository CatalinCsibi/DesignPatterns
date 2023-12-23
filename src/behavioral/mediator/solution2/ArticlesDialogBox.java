package behavioral.mediator.solution2;

public class ArticlesDialogBox  {

    private ListBox articlesListBox = new ListBox();
    private TextBox tilesTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticlesDialogBox() {
        articlesListBox.addEventHandler(this::articlesSelected);
        tilesTextBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction() {
        articlesListBox.setSelection("Article 1");
        tilesTextBox.setContent(null);
//        tilesTextBox.setContent("Article 2");
        System.out.println("TextBox: " + tilesTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
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
