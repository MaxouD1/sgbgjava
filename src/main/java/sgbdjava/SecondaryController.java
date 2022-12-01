package sgbdjava;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class SecondaryController {

    @FXML
    private Label txtChange;

    @FXML
    private Button btnColor;

    @FXML
    void switchColorAndText(ActionEvent event) {
        String changement = "Coucou!";
        txtChange.setText(changement);
        btnColor.setTextFill(Color.RED);
    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}