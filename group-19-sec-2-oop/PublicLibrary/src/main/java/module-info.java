module org.example.publiclibrary {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;


    opens org.example.publiclibrary to javafx.fxml;
    exports org.example.publiclibrary;
}