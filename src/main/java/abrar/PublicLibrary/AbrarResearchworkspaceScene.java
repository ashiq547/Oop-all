package abrar.PublicLibrary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AbrarResearchworkspaceScene {

    @FXML
    private TextField textFieldWorkspaceName;

    @FXML
    private TableView<?> tableViewUpdates;

    @FXML
    private Label labelStatus;

    /**
     * Handles creating a new workspace.
     */
    @FXML
    private void handleCreateWorkspace(ActionEvent event) {
        String workspaceName = textFieldWorkspaceName.getText().trim();
        if (workspaceName.isEmpty()) {
            labelStatus.setText("Please enter a name to create a workspace.");
            return;
        }
        labelStatus.setText("Workspace '" + workspaceName + "' created successfully!");
        // Logic to create the workspace goes here
    }



    @FXML
    private void handleJoinWorkspace(ActionEvent event) {
        String workspaceName = textFieldWorkspaceName.getText().trim();
        if (workspaceName.isEmpty()) {
            labelStatus.setText("Please enter a name to join a workspace.");
            return;
        }
        labelStatus.setText("Joined workspace '" + workspaceName + "' successfully!");

    }



    @FXML
    private void handleManageTools(ActionEvent event) {
        labelStatus.setText("Managing tools for workspace. Feature under development.");

    }


    @FXML
    private void handleViewUpdates(ActionEvent event) {
        labelStatus.setText("Fetching updates. Feature under development.");

    }

    @FXML
    private void handleBackToMenu(ActionEvent event) {
        labelStatus.setText("Returning to the main menu.");

    }
}
