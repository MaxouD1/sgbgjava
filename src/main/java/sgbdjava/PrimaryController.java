package sgbdjava;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtPivot;

    @FXML
    void btnPivoterClick(ActionEvent event) {
        String rotatioString = txtPivot.getText();
        int rotation = Integer.parseInt(rotatioString);
        txtPivot.setRotate(rotation);
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

}
