
package abrar.PublicLibrary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AbrarResearchPaperScene {

    @FXML
    private TextField textFieldResourceName; // TextField for resource name input

    @FXML
    private Label labelStatusMessage; // Label to display confirmation messages

    @FXML
    private void handleRequestAccess(ActionEvent actionEvent) {

        String resourceName = textFieldResourceName.getText().trim();

        // Validate user input
        if (resourceName.isEmpty()) {
            labelStatusMessage.setText("Please enter a resource name.");
            return;
        }


        boolean accessGranted = checkResourceAccess(resourceName);


        if (accessGranted) {
            labelStatusMessage.setText("Access granted! You can now download or view the resource.");

        } else {
            labelStatusMessage.setText("Access denied. Please check your membership level.");
        }
    }


    private boolean checkResourceAccess(String resourceName) {

        return resourceName.equalsIgnoreCase("Research Paper 101") ||
                resourceName.equalsIgnoreCase("Allowed Journal");
    }
}
