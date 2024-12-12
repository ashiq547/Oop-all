package org.example.publiclibrary;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;


public class AbrarBranchSceneV
{

    @javafx.fxml.FXML
    private TextArea listViewResults;
    @javafx.fxml.FXML
    private Label dsds;
    @javafx.fxml.FXML
    private Label fsds;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnViewContacts(ActionEvent actionEvent) {
        listViewResults.setText(
                "Main Branch: Phone - (123) 456-7890, Email - main@library.com Downtown Branch: Phone - (987) 654-3210, Email - downtown@library.com Suburban Branch: Phone - (456) 123-7890, Email - suburban@library.com"
        );
    }

    @javafx.fxml.FXML
    public void btnViewBranches(ActionEvent actionEvent) {
        listViewResults.setText(
                "Main Branch: 123 Library St.Downtown Branch: 456 Reading Ln.Suburban Branch: 789 Book Rd."
        );
    }

    @javafx.fxml.FXML
    public void btnBackToMenu1(ActionEvent actionEvent) {
        System.out.println("Back to Main Menu clicked!");
    }
}