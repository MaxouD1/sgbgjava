module sgbdjava {
    requires javafx.controls;
    requires javafx.fxml;

    opens sgbdjava to javafx.fxml;
    exports sgbdjava;
}
