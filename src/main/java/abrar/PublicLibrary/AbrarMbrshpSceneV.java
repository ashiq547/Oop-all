package abrar.PublicLibrary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class AbrarMbrshpSceneV {

    @FXML
    private TextArea textAreaMembership;

    @FXML
    public void initialize() {
        // Ensures that the TextArea is not editable
        textAreaMembership.setEditable(false);
    }

    @FXML
    public void handleBackToMenu(ActionEvent actionEvent) {
        // Simulates fetching membership information and displays it in the TextArea
        String membershipInfo = """
            Membership Information:
            - Standard Membership: $20/year
            - Premium Membership: $50/year
            - Benefits:
              * Access to books, journals, and multimedia resources
              * Priority registration for events and workshops
            - To apply:
              * Visit our library or apply online through our website.
        """;
        textAreaMembership.setText(membershipInfo);
    }

    @FXML
    public void handBackMenu(ActionEvent actionEvent) {
        // Simulates navigation back to the main menu
        System.out.println("Navigating back to the main menu...");
        // Add actual navigation logic here if needed
    }
}
