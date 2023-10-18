package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class OrderDetailsFormController {

    public JFXComboBox cmbSearch;
    @FXML
    private AnchorPane orderDetailsPane;


    @FXML
    private JFXTreeTableView<?> tblOrderDetails;

    @FXML
    private TreeTableColumn<?, ?> colOrderDetailsId;

    @FXML
    private TreeTableColumn<?, ?> colOrderDetailsDate;

    @FXML
    private TreeTableColumn<?, ?> colOrderDetailsTotal;

    @FXML
    private TreeTableColumn<?, ?> colOrderDetailsCustomerName;

    @FXML
    private TreeTableColumn<?, ?> colOrderDetailsContact;

    @FXML
    private TreeTableColumn<?, ?> colOrderDetailsEmail;

    @FXML
    private TreeTableColumn<?, ?> colOrderDetailsEmployer;

    @FXML
    private TreeTableColumn<?, ?> colOrderDetailsArriers;

    @FXML
    private JFXTreeTableView<?> tblOrderDetailsItem;

    @FXML
    private TreeTableColumn<?, ?> colItemCode;

    @FXML
    private TreeTableColumn<?, ?> colDescription;

    @FXML
    private TreeTableColumn<?, ?> colQty;

    @FXML
    private TreeTableColumn<?, ?> colUnitPrice;

    @FXML
    private TreeTableColumn<?, ?> colDate;

    @FXML
    private TreeTableColumn<?, ?> colDiscount;

    @FXML
    private TreeTableColumn<?, ?> colType;

    @FXML
    private TreeTableColumn<?, ?> colSize;

    @FXML
    private TreeTableColumn<?, ?> colAmount;

    @FXML
    void cmbSearch(ActionEvent event) {

    }

    @FXML
    void orderDetailsBackButtonOnAction(ActionEvent event) {

    }

    @FXML
    void orderDetailsRefreshButtonOnAction(ActionEvent event) {

    }

    public void orderDetailsBackButtonOnAction(javafx.event.ActionEvent actionEvent) {
        Stage stage = (Stage) orderDetailsPane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/NormalForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.show();

    }

    public void orderDetailsRefreshButtonOnAction(javafx.event.ActionEvent actionEvent) {

    }


}