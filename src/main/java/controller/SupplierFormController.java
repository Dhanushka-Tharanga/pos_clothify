package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import db.DBConnection;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.function.Supplier;

public class SupplierFormController implements Initializable {

    @FXML
    private AnchorPane supplierPane;

    @FXML
    private JFXTreeTableView<?> tblSupplierItem;

    @FXML
    private TreeTableColumn<?, ?> colItemCode;

    @FXML
    private TreeTableColumn<?, ?> colDescription;

    @FXML
    private TreeTableColumn<?, ?> colQty;

    @FXML
    private JFXTreeTableView<?> supplierMainTable;

    @FXML
    private TreeTableColumn<?, ?> colSupId;

    @FXML
    private TreeTableColumn<?, ?> colSupTitle;

    @FXML
    private TreeTableColumn<?, ?> colSupName;

    @FXML
    private TreeTableColumn<?, ?> colSupCompany;

    @FXML
    private TreeTableColumn<?, ?> colSupContact;

    @FXML
    private TreeTableColumn<?, ?> colSupEmail;

    @FXML
    private TreeTableColumn<?, ?> colSupOption;

    @FXML
    private JFXComboBox combTitle;

    @FXML
    private JFXTextField txtSupplierId;

    @FXML
    private JFXTextField txtSupplierName;

    @FXML
    private JFXTextField txtContact;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXTextField txtCompany;

    @FXML
    private JFXTextField txtSearch;

    @FXML
    void backButtonOnAction(ActionEvent event) {

    }

    @FXML
    void clearButtonOnAction(ActionEvent event) {

    }

    @FXML
    void printButtonOnAction(ActionEvent event) {

    }

    @FXML
    void saveButtonOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void saveButtonOnAction(javafx.event.ActionEvent actionEvent) {
        try {

            Connection connection = DBConnection.getInstance().getConnection();
            String sql = "INSERT INTO suppliers VALUES (?,?,?,?,?,?)";
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setInt(1,Integer.parseInt(txtSupplierId.getText()));
            pstm.setString(2,txtSupplierName.getText());
            pstm.setString(3,txtCompany.getText());
            pstm.setString(4,txtContact.getText());
            pstm.setString(5,txtEmail.getText());
            pstm.setString(6,(String) combTitle.getValue());

            if (pstm.executeUpdate()>0) {
                new Alert(Alert.AlertType.INFORMATION,"Customer Saved..!").show();

            }else{
                new Alert(Alert.AlertType.ERROR,"Something went wrong..!").show();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



}

    public void clearButtonOnAction(javafx.event.ActionEvent actionEvent) {

    }

    public void printButtonOnAction(javafx.event.ActionEvent actionEvent) {

    }

    public void backButtonOnAction(javafx.event.ActionEvent actionEvent) {
        Stage stage = (Stage) supplierPane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/NormalForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.show();

    }
}
