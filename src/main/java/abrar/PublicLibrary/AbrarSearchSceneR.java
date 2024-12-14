package abrar.PublicLibrary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AbrarSearchSceneR {

    @FXML
    private TextField textFieldYear;

    @FXML
    private TextField textFieldAuthor;

    @FXML
    private TextField textFieldResourceType;

    @FXML
    private TableView<?> tableViewResults;


    @FXML
    void handleSearch(ActionEvent event) {
        // Retrieve input from text fields
        String publicationYear = textFieldYear.getText();
        String author = textFieldAuthor.getText();
        String resourceType = textFieldResourceType.getText();

        // Print inputs for debugging
        System.out.println("Advanced Search initiated with:");
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author: " + author);
        System.out.println("Resource Type: " + resourceType);


    }


    @FXML
    void handleBackToMenu(ActionEvent event) {
        System.out.println("Navigating back to the main menu...");

    }


    private void updateTableViewResults(Object results) {

    }
}
