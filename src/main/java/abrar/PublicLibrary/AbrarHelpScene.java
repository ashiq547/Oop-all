package abrar.PublicLibrary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class AbrarHelpScene {

    @FXML
    private TextArea textAreaQuery; // Reference to the query text area

    @FXML
    private Label labelConfirmation; // Reference to the confirmation label

    /**
     * Initializes the scene.
     */
    @FXML
    public void initialize() {
        System.out.println("Ask a Librarian Scene Initialized.");
        // Clear the confirmation label on load
        labelConfirmation.setText("");
    }

    /**
     * Handles the submit query button click event.
     */
    @FXML
    public void handleSubmitQuery(ActionEvent actionEvent) {
        // Retrieve the user's query from the text area
        String query = textAreaQuery.getText().trim();

        if (query.isEmpty()) {
            // Show an alert if the query is empty
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Input Error");
            alert.setHeaderText(null);
            alert.setContentText("Please enter a query before submitting.");
            alert.showAndWait();
        } else {
            // Simulate sending the query
            System.out.println("Query submitted: " + query);

            // Display a confirmation message to the user
            labelConfirmation.setText("Your query has been submitted! Estimated response time: 24 hours.");

            // Clear the text area after submission
            textAreaQuery.clear();
        }
    }
}
