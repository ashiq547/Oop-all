package asif.library;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EventOrganizer {
    @FXML
    protected void onLogOutButtonClick(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
    }

    @FXML
    protected void onBackButtonClick(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboard.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
    }
    @FXML
    protected void ongoToOrganizerSheduleEvents(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("OrganizerSheduleEvents.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
    }

    @FXML
    protected void ongoToEventRegistration(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("EventRegistration.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
    }

    @FXML
    protected void ongoToEventNotifyParticipants(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("NotifyParticipants.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
    }

    @FXML
    protected void ongoToUpdateEventDetails(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("UpdateEventDetails.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
    }

    @FXML
    protected void ongoToCancelEvents(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CancelEvents.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
    }

    @FXML
    protected void ongoToUpcomingEvents(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("UpcomingEvents.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
    }

    @FXML
    protected void ongoToEventReports(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("EventReports.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
    }

    @FXML
    protected void ongoToFeedBack(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FeedBack.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);

        stage.setScene(scene);
    }

}



