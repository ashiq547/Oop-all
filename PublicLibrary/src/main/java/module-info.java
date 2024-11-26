module org.example.publiclibrary {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.publiclibrary to javafx.fxml;
    exports org.example.publiclibrary;
}