package org.example.publiclibrary;

import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;

import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
public class DemoBookEntry
{
    @FXML
    private TableColumn dopTC;
    @FXML
    private TextField nameTF;
    @FXML
    private TableColumn bookIDTC;
    @FXML
    private TableColumn  bookNameTC;
    @FXML
    private TextField genreTF;
    @FXML
    private TableColumn  genreTC;
    @FXML
    private TextField idTF;
    @FXML
    private TableView bookTableView;
    @FXML
    private DatePicker dopTF;

    @FXML
    public void initialize() {
        bookIDTC.setCellEditor((TableCellEditor) new PropertyValueFactory<Books, Integer>("bookID"));
        bookNameTC.setCellEditor((TableCellEditor) new PropertyValueFactory<Books, String>("BookName"));
        dopTC.setCellEditor((TableCellEditor) new PropertyValueFactory<Books, LocalDate>("dateofpublish"));
        genreTC.setCellEditor((TableCellEditor) new PropertyValueFactory<Books, String>("genre"));


    }

    @FXML
    public void savebuttonOnClick() {
        savebuttonOnClick(null);
    }

    @FXML
    public void savebuttonOnClick(ActionEvent actionEvent) {
         Books i;
        i = new Books(idTF.getText(), nameTF.getText(), dopTF.getValue(), genreTF.getText());

        FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            File f = null;
            try {
                f = new File("Books.bin");
                if (f.exists()) {
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                } else {
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }

                oos.writeObject(i);

            } catch (IOException ex) {
                Logger.getLogger(DemoBookEntry.class
                        .getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (oos != null) {
                        oos.close();

                    }
                } catch (IOException ex) {
                    Logger.getLogger(DemoBookEntry.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }

        }


    @FXML
    public void backBtnOnClick(ActionEvent actionEvent) {
    }
}