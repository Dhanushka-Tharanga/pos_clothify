package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeFormController implements Initializable {

    @FXML
    private AnchorPane employeePane;


    public void backButtonOnAction(javafx.event.ActionEvent actionEvent) {
        Stage stage = (Stage) employeePane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/NormalForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}