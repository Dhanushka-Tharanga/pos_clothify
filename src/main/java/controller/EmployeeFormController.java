package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class EmployeeFormController {

    @FXML
    private AnchorPane employeePane;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) employeePane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/NormalForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        stage.show();

    }

    public void backButtonOnAction(javafx.event.ActionEvent actionEvent) {

    }
}