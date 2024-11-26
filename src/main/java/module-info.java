module asif.library {
    requires javafx.controls;
    requires javafx.fxml;


    opens asif.library to javafx.fxml;
    exports asif.library;
}