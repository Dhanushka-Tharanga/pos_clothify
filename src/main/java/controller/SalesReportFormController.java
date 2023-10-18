package controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SalesReportFormController implements Initializable {

    @FXML
    private AnchorPane salesReportFormPane;

    @FXML
    private JFXComboBox<?> combDate;

    @FXML
    private Label lblProfit;

    @FXML
    private Label lblSalesCount;

    @FXML
    private Label labelSales;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void salesReportBackButtonOnAction(javafx.event.ActionEvent actionEvent) {
        Stage stage = (Stage) salesReportFormPane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/NormalForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.show();
    }

    public void getAnnualReportButtonOnAction(javafx.event.ActionEvent actionEvent) {

    }

    public void getMonthlyReportsButtonOnAction(javafx.event.ActionEvent actionEvent) {

    }

    public void getDailyReportsButtonOnAction(javafx.event.ActionEvent actionEvent) {

    }




}