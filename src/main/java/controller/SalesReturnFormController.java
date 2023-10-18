package controller;

import com.jfoenix.controls.JFXTreeTableView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SalesReturnFormController implements Initializable {

    public javafx.scene.control.Label labelTotal;
    @FXML
    private AnchorPane salesReturnPane;
    @FXML
    private JFXTreeTableView<?> tblItem;

    @FXML
    private TreeTableColumn<?, ?> tblItemCode;

    @FXML
    private TreeTableColumn<?, ?> tblItemDesc;

    @FXML
    private TreeTableColumn<?, ?> tblItemQty;

    @FXML
    private TreeTableColumn<?, ?> tblItemSellingPrice;

    @FXML
    private TreeTableColumn<?, ?> tblItemBuyingPrice;

    @FXML
    private TreeTableColumn<?, ?> tblItemProfit;

    @FXML
    private TreeTableColumn<?, ?> tblItemType;

    @FXML
    private TreeTableColumn<?, ?> tblItemSize;

    @FXML
    private TreeTableColumn<?, ?> tblItemSupplierId;

    @FXML
    private TreeTableColumn<?, ?> tblItemOption;

    public SalesReturnFormController() {
    }


    @FXML
    void clearSalesReturnButtonOnAction(ActionEvent event) {

    }

    @FXML
    void placeReturnButtonOnAction(ActionEvent event) {

    }

    @FXML
    void salesReturnBackButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) salesReturnPane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/NormalForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        stage.show();


    }

    @FXML
    void updateSalesReturnButtonOnAction(ActionEvent event) {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}
