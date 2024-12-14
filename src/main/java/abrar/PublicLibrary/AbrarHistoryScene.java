package abrar.PublicLibrary;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class AbrarHistoryScene {

    @FXML
    private TableView<BorrowedItem> tableViewBorrowedItems;

    @FXML
    private Label labelFeedback;

    // ObservableList to hold borrowed items
    private ObservableList<BorrowedItem> borrowedItems;

    @FXML
    public void initialize() {
        // Initialize TableView columns
        TableColumn<BorrowedItem, String> titleColumn = (TableColumn<BorrowedItem, String>) tableViewBorrowedItems.getColumns().get(0);
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));

        TableColumn<BorrowedItem, String> dueDateColumn = (TableColumn<BorrowedItem, String>) tableViewBorrowedItems.getColumns().get(1);
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));

        // Initialize the list of borrowed items
        borrowedItems = FXCollections.observableArrayList();
        tableViewBorrowedItems.setItems(borrowedItems);
    }

    @FXML
    public void handleFetchHistory(ActionEvent actionEvent) {
        // Simulate fetching borrowing history
        borrowedItems.clear(); // Clear the list before adding new items
        borrowedItems.add(new BorrowedItem("Research Techniques", "2024-12-20"));
        borrowedItems.add(new BorrowedItem("Library Management", "2024-12-25"));
        borrowedItems.add(new BorrowedItem("Data Analytics", "2024-12-30"));

        labelFeedback.setText("Borrowing history fetched successfully!");
    }

    @FXML
    public void handleRenewItem(ActionEvent actionEvent) {
        // Get the selected item from the TableView
        BorrowedItem selectedItem = tableViewBorrowedItems.getSelectionModel().getSelectedItem();

        if (selectedItem == null) {
            // Show an alert if no item is selected
            showAlert("Renewal Error", "No item selected. Please select an item to renew.");
        } else {
            // Simulate renewal logic
            String message = "Renewal successful for: " + selectedItem.getTitle();
            labelFeedback.setText(message);
        }
    }

    @FXML
    public void handleBackToMenu(ActionEvent actionEvent) {
        // Navigate back to the main menu (implementation depends on your application)
        System.out.println("Navigating back to the main menu...");
    }

    private void showAlert(String title, String message) {
        // Utility method to show alerts
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Class to represent borrowed items
    public static class BorrowedItem {
        private final String title;
        private final String dueDate;

        public BorrowedItem(String title, String dueDate) {
            this.title = title;
            this.dueDate = dueDate;
        }

        public String getTitle() {
            return title;
        }

        public String getDueDate() {
            return dueDate;
        }
    }
}
