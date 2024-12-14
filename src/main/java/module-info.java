module com.example.sajid2222122 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.sajid2222122 to javafx.fxml;
    exports com.example.sajid2222122;
}