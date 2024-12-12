package org.example.publiclibrary;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AbrarctglogSceneV {

    @FXML
    private TextField entrathrtitle;

    @FXML
    private TableColumn<BookDetails, String> eavailbility;

    @FXML
    private TextField ebt;

    @FXML
    private TableColumn<BookDetails, String> entrbooktitle;

    @FXML
    private TextField entravailability;

    @FXML
    private TableColumn<BookDetails, String> eathr;

    @FXML
    private TableView<BookDetails> tableView;

    // ObservableList to store table data
    private ObservableList<BookDetails> bookDetailsList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Set up the table columns to map to the BookDetails fields
        entrbooktitle.setCellValueFactory(new PropertyValueFactory<>("bookTitle"));
        eathr.setCellValueFactory(new PropertyValueFactory<>("author"));
        eavailbility.setCellValueFactory(new PropertyValueFactory<>("availability"));

        // Assign the observable list to the table view
        tableView.setItems(bookDetailsList);
    }

    @FXML
    public void btn(ActionEvent actionEvent) {
        // Retrieve input values from text fields
        String bookTitle = ebt.getText();
        String author = entrathrtitle.getText();
        String availability = entravailability.getText();

        // Create a new BookDetails object with the inputs
        BookDetails bookDetails = new BookDetails(bookTitle, author, availability);

        // Add the new book details to the ObservableList
        bookDetailsList.add(bookDetails);

        // Clear input fields for new entry
        ebt.clear();
        entrathrtitle.clear();
        entravailability.clear();
    }

    // Class to represent each book's details
    public static class BookDetails {
        private String bookTitle;
        private String author;
        private String availability;

        public BookDetails(String bookTitle, String author, String availability) {
            this.bookTitle = bookTitle;
            this.author = author;
            this.availability = availability;
        }

        public String getBookTitle() {
            return bookTitle;
        }

        public void setBookTitle(String bookTitle) {
            this.bookTitle = bookTitle;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAvailability() {
            return availability;
        }

        public void setAvailability(String availability) {
            this.availability = availability;
        }
    }
}
