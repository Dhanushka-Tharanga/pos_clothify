package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import db.DBConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class OrderFormController implements Initializable {

    public javafx.scene.control.Label lblCustomerId;
    @FXML
    private AnchorPane orderPane;
    @FXML
    private Label labelOrderId;

    @FXML
    private JFXButton backButtonOnAction;
    @FXML
    private JFXTextField txtDate;

    @FXML
    private JFXTextField txtCustomerContact;

    @FXML
    private JFXTextField txtCustomerName;

    @FXML
    private JFXComboBox cmbEmpId;

    @FXML
    private JFXTextField txtEmployer;

    @FXML
    private JFXTextField txtItemCode;

    @FXML
    private JFXTextField txtDescription;

    @FXML
    private JFXTextField txtType;

    @FXML
    private JFXTextField txtDiscount;

    @FXML
    private JFXTextField txtQty;

    @FXML
    private JFXTextField txtSellingPrice;

    @FXML
    private JFXTextField txtSize;

    @FXML
    private JFXTextField txtQtyOnHand;

    @FXML
    private JFXTextField txtProfit;

    @FXML
    private Label lblTotal;
    @FXML
    private Label lblDiscount;

    @FXML
    private Label lblBalance;

    @FXML
    private Label lblCash;

    @FXML
    private JFXTreeTableView<?> tblOrder;

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
    private TreeTableColumn<?, ?> colOption;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        generateId();
        loadEmployerName();
    }
    private void generateId() {
        try {
            Connection connection  = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("SELECT customer_id FROM customers  ");
            ResultSet resultSet = pstm.executeQuery();
            if (resultSet.next()){
                int num = Integer.parseInt(resultSet.getString(1));
                num++;
                lblCustomerId.setText(String.format("C%03d",num));
            }else {
                lblCustomerId.setText("C001");
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    private void loadEmployerName() {
        try {
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement pstm = connection.prepareStatement("SELECT first_name FROM employees");
            ResultSet resultSet = pstm.executeQuery();

            ObservableList<String> employerIds = FXCollections.observableArrayList();

            while (resultSet.next()){
                employerIds.add(resultSet.getString(1));
            }
            cmbEmpId.setItems(employerIds);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }



    @FXML
    public void backButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) orderPane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/NormalForm.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        stage.show();
    }

    @FXML
    void addToCartButtonOnAction(ActionEvent event) {

    }
    @FXML
    void chckCard(ActionEvent event) {

    }

    @FXML
    void chckCash(ActionEvent event) {

    }

}








