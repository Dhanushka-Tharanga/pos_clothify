package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ItemFormController implements Initializable {

    @FXML
    private AnchorPane itemPane;

    @FXML
    private JFXTextField txtBuyingPrice;

    @FXML
    private JFXTextField txtQty;

    @FXML
    private JFXTextField txtDescription;

    @FXML
    private JFXTextField txtItemCode;

    @FXML
    private JFXTextField txtSellingPrice;

    @FXML
    private JFXTextField txtProfit;

    @FXML
    private JFXTextField txtAddQty;

    @FXML
    private JFXComboBox<?> cmbType;

    @FXML
    private JFXComboBox<?> cmdSupplierId;

    @FXML
    private JFXComboBox<?> cmbSupplierName;

    @FXML
    private JFXTextField txtSearchField;

    @FXML
    private JFXComboBox<?> cmbSize;

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






   public void printButtonOnAction(javafx.event.ActionEvent actionEvent) {

    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void itemBackButtonOnAction(javafx.event.ActionEvent actionEvent) {
        Stage stage = (Stage) itemPane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/NormalForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        stage.show();

    }

    public void addButtonOnAction(javafx.event.ActionEvent actionEvent) {

    }

    public void saveButtonOnAction(javafx.event.ActionEvent actionEvent) {

    }

    public void addStockButtonOnAction(javafx.event.ActionEvent actionEvent) {

    }

    public void clearButtonOnAction(javafx.event.ActionEvent actionEvent) {

    }
}
