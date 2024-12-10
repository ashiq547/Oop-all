package org.example.publiclibrary;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneManager {

    private static Stage stage;

    /**
     * Switches the current scene to a new FXML file.
     *
     * @param fxmlFile The FXML file path to load for the new scene.
     * @throws IOException If the FXML file cannot be loaded.
     */
    public static void switchScene(String fxmlFile) throws IOException {
        FXMLLoader loader = new FXMLLoader(SceneManager.class.getResource(fxmlFile));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Switches the scene using an event source to derive the stage.
     *
     * @param event    The event that triggered the scene switch.
     * @param fxmlFile The FXML file path to load for the new scene.
     * @throws IOException If the FXML file cannot be loaded.
     */
    public static void switchScene(Object event, String fxmlFile) throws IOException {
        Stage stage = (Stage) ((Node) event).getScene().getWindow();
        switchScene(fxmlFile);
    }
}
