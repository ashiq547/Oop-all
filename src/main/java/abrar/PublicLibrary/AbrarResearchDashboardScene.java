package abrar.PublicLibrary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class AbrarResearchDashboardScene {

    // FXML component references
    @FXML
    private TextField textFieldSearch; // Search field

    @FXML
    private TextField textFieldBookTitle; // Book title field for reservation

    @FXML
    private TableView<?> tableViewResults; // TableView for search results

    @FXML
    private Label textFieldYear; // Label for year filter (currently unused)

    @FXML
    private Label textFieldAuthor; // Label for author filter (currently unused)

    @FXML
    private Label textFieldResourceType; // Label for resource type filter (currently unused)

    @FXML
    private Button handleSearch; // Search button

    @FXML
    private Button handleReserveBook; // Reserve book button

    @FXML
    private Button handleRenewItems; // Borrow section button

    // Method for handling "Search" button click
    @FXML
    private void handleSearch(ActionEvent event) {
        String query = textFieldSearch.getText().trim(); // Get search input
        if (query.isEmpty()) {
            showAlert("Error", "Search field cannot be empty. Please enter a search term.", AlertType.ERROR);
        } else {
            // Add logic for searching resources
            System.out.println("Searching for: " + query);
            // Example: Update tableViewResults with search results
            // tableViewResults.setItems(fetchSearchResults(query));
            showAlert("Search", "Search for '" + query + "' executed successfully!", AlertType.INFORMATION);
        }
    }

    // Method for handling "Reserve Book" button click
    @FXML
    private void handleReserveBook(ActionEvent event) {
        String bookTitle = textFieldBookTitle.getText().trim(); // Get book title input
        if (bookTitle.isEmpty()) {
            showAlert("Error", "Book title field cannot be empty. Please enter a book title.", AlertType.ERROR);
        } else {
            // Add logic for reserving a book
            System.out.println("Reserving book: " + bookTitle);
            // Example: Check if the book is available or add to a waitlist
            showAlert("Reservation", "Book '" + bookTitle + "' reserved successfully!", AlertType.INFORMATION);
        }
    }

    // Method for handling "Borrow Section" button click
    @FXML
    private void handleRenewItems(ActionEvent event) {
        // Add logic for navigating to the borrowing section
        System.out.println("Navigating to Borrowed Items section...");
        showAlert("Borrow Section", "Borrowed Items section will be implemented here.", AlertType.INFORMATION);
    }

    // Utility method to display alerts
    private void showAlert(String title, String message, AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
