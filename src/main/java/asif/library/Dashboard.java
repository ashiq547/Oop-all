package asif.library;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Dashboard {
    @FXML
    protected void onLogOutButtonClick(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
    }

    @FXML
    protected void goToLibrary(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Library.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
    }

    @FXML
    protected void goToEventOrg(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Event-organizer.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
    }

}
