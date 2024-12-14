package abrar.PublicLibrary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AbrarReservationsScene {

    @FXML
    private TextField textFieldBookTitle;

    @FXML
    private TableView<String> tableViewReservationStatus;

    @FXML
    void handleBackToMenu(ActionEvent event) {
        // Logic to navigate back to the main menu
        System.out.println("Navigating back to the main menu...");

    }

    @FXML
    void handleReserveBook(ActionEvent event) {
        // Get the book title from the input field
        String bookTitle = textFieldBookTitle.getText().trim();

        if (bookTitle.isEmpty()) {

            showAlert("Error", "Please enter a book title to reserve.", Alert.AlertType.ERROR);
            return;
        }


        boolean isBookAvailable = checkBookAvailability(bookTitle);

        if (isBookAvailable) {
            // Add to the table as a reserved book
            tableViewReservationStatus.getItems().add("Book: " + bookTitle + " - Reserved");
            showAlert("Success", "Book \"" + bookTitle + "\" reserved successfully.", Alert.AlertType.INFORMATION);
        } else {
            // Add to the table as a waiting list entry
            tableViewReservationStatus.getItems().add("Book: " + bookTitle + " - Added to Waiting List");
            showAlert("Info", "Book \"" + bookTitle + "\" is currently unavailable. You've been added to the waiting list.", Alert.AlertType.INFORMATION);
        }


        textFieldBookTitle.clear();
    }

    private boolean checkBookAvailability(String bookTitle) {

        return Math.random() > 0.5;
    }

    private void showAlert(String title, String message, Alert.AlertType alertType) {

        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
