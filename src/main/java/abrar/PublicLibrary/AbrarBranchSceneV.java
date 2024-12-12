package org.example.publiclibrary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class AbrarBranchSceneV {

    @FXML
    private ListView<String> listViewResults; // Updated to correct type for ListView

    @FXML
    public void initialize() {
        // Initialization logic if needed
    }

    /**
     * Displays branch locations in the listViewResults.
     */
    @FXML
    public void btnViewBranches(ActionEvent actionEvent) {
        listViewResults.getItems().clear(); // Clear previous results
        listViewResults.getItems().addAll(
                "Main Branch: 123 Library St.",
                "Downtown Branch: 456 Reading Ln.",
                "Suburban Branch: 789 Book Rd."
        );
    }

    /**
     * Displays contact information in the listViewResults.
     */
    @FXML
    public void btnViewContacts(ActionEvent actionEvent) {
        listViewResults.getItems().clear(); // Clear previous results
        listViewResults.getItems().addAll(
                "Main Branch: Phone - (123) 456-7890, Email - main@library.com",
                "Downtown Branch: Phone - (987) 654-3210, Email - downtown@library.com",
                "Suburban Branch: Phone - (456) 123-7890, Email - suburban@library.com"
        );
    }

    /**
     * Navigates back to the main menu.
     */
    @FXML
    public void btnBackToMenu1(ActionEvent actionEvent) {
        // Code to switch scenes to the main menu
        System.out.println("Back to Main Menu clicked!");
        // Replace this with actual scene-switching logic if applicable
    }
}
