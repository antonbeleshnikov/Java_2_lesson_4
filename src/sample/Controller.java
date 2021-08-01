package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {
    @FXML
    public TextField textField;
    @FXML
    public TextArea textArea;

    @FXML
    public void sendMessage(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }
}
