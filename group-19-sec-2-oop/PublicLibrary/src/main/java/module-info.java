module org.example.publiclibrary {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.publiclibrary to javafx.fxml;
    exports org.example.publiclibrary;
}