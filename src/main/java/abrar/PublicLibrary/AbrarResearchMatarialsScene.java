package abrar.PublicLibrary;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AbrarResearchMatarialsScene {

    @FXML
    private TextField textFieldSearch;

    @FXML
    private TableView<ResearchMaterial> tableViewResults;


    private ObservableList<ResearchMaterial> searchResults;

    @FXML
    public void initialize() {
        // Initialize TableView columns
        TableColumn<ResearchMaterial, String> titleColumn = (TableColumn<ResearchMaterial, String>) tableViewResults.getColumns().get(0);
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));

        TableColumn<ResearchMaterial, String> typeColumn = (TableColumn<ResearchMaterial, String>) tableViewResults.getColumns().get(1);
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));


        searchResults = FXCollections.observableArrayList();
        tableViewResults.setItems(searchResults);
    }

    @FXML
    public void handleSearchMaterials(ActionEvent actionEvent) {

        String query = textFieldSearch.getText().trim();

        if (query.isEmpty()) {
            System.out.println("Search query is empty.");
            return;
        }

        searchResults.clear(); // Clear previous results
        searchResults.add(new ResearchMaterial("Advanced Data Analysis", "Journal"));
        searchResults.add(new ResearchMaterial("Machine Learning Techniques", "Research Paper"));
        searchResults.add(new ResearchMaterial("Library Science Handbook", "Reference Book"));

        System.out.println("Search completed for: " + query);
    }

    @FXML
    public void handleBackToMenu(ActionEvent actionEvent) {

        System.out.println("Navigating back to the main menu...");
    }

    public static class ResearchMaterial {
        private final String title;
        private final String type;

        public ResearchMaterial(String title, String type) {
            this.title = title;
            this.type = type;
        }

        public String getTitle() {
            return title;
        }

        public String getType() {
            return type;
        }
    }
}
