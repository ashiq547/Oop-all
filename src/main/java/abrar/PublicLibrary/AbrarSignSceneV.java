package abrar.PublicLibrary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

class AbrarPresourceSceneV {

    @FXML
    public void initialize() {
        // Initialization logic (if needed)
        System.out.println("Scene initialized successfully!");
    }

    @FXML
    public void handleBackToMenu(ActionEvent event) {
        // Logic to navigate back to the main menu
        System.out.println("Navigating back to the main menu...");
        showAlert("Navigation", "Returning to the Main Menu", AlertType.INFORMATION);
    }

    private void showAlert(String navigation, String returningToTheMainMenu, AlertType alertType) {
    }

    @FXML
    public void handleDownloadResource(ActionEvent event) {
        // Logic for fetching public resources
        System.out.println("Fetching public resources...");
        showAlert("Resources", "Public resources fetched successfully.", AlertType.INFORMATION);
    }

    @FXML
    public void handleFetchResources(ActionEvent event) {
        // Logic for downloading a selected resource
        System.out.println("Downloading the selected resource...");
        showAlert("Download", "The selected resource is being downloaded.", AlertType.INFORMATION);
    }


