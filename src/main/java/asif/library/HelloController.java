package asif.library;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label msgLabel;

    @FXML
    private TextField usernameInput;

    @FXML
    private PasswordField passwordInput;

    @FXML
    protected void onSignInButtonClick(ActionEvent event) throws IOException {
        String username = usernameInput.getText();
        String password = passwordInput.getText();

        if (username.equals("asif") && password.equals("1234")) {
//            msgLabel.setText("Log in successful!");
            // switch scene to dashboard

//            Stage stage = new Stage();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboard.fxml"));
            Parent root = fxmlLoader.load();

            Scene scene = new Scene(root);

            stage.setScene(scene);
        } else {
//            msgLabel.setText(("Log in failed!"));
        }
    }
}