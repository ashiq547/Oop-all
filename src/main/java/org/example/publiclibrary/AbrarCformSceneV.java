package org.example.publiclibrary;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class AbrarCformSceneV {

    @FXML
    private TextArea textAreaPost;

    @FXML
    private ListView<String> listViewThreads;

    private ObservableList<String> threadsList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Initialize the threads list with sample data
        threadsList.addAll(
                "Welcome to the Community Forum!",
                "Library Hours Discussion",
                "Recommended Books",
                "General Inquiries"
        );

        // Set the threads list to the ListView
        listViewThreads.setItems(threadsList);
    }

    @FXML
    public void Text(ActionEvent actionEvent) {
        // Get the text from the TextArea
        String postContent = textAreaPost.getText();

        if (postContent != null && !postContent.trim().isEmpty()) {
            // Add the post to the threads list
            threadsList.add(postContent);

            // Clear the TextArea for the next post
            textAreaPost.clear();
        }
    }

    @FXML
    public void btnBackToMenu1(ActionEvent actionEvent) {
        // Logic for navigating back to the main menu
        System.out.println("Navigating back to the main menu.");
        // Implementation depends on your application's navigation structure
    }
}
