package org.example.publiclibrary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AbrarPoilcySceneV {

    @FXML
    private TextArea policyTextArea;

    @FXML
    public void initialize() {
        // Optionally preload policies or setup configurations here
    }

    @FXML
    public void handleViewPolicies(ActionEvent actionEvent) {
        // Displaying policies in the TextArea
        String policies = "Library Policies:\n\n" +
                "1. Borrowing Rules: \n   - Books can be borrowed for up to 2 weeks.\n" +
                "2. Internet Usage: \n   - Internet access is free for members.\n" +
                "3. Conduct: \n   - Maintain silence in reading areas.\n";

        policyTextArea.setText(policies);
    }

    @FXML
    public void handleDownloadPolicies(ActionEvent actionEvent) {
        // Downloading policies as a text file
        String policies = policyTextArea.getText();
        if (policies == null || policies.isEmpty()) {
            policyTextArea.setText("Please view the policies first before downloading.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("LibraryPolicies.txt"))) {
            writer.write(policies);
            policyTextArea.setText("Policies have been downloaded as 'LibraryPolicies.txt'.");
        } catch (IOException e) {
            policyTextArea.setText("An error occurred while downloading policies.");
        }
    }

    @FXML
    public void btnBackToMenu(ActionEvent actionEvent) {
        // Logic for navigating back to the main menu
        policyTextArea.setText("Returning to main menu...");
    }
}
