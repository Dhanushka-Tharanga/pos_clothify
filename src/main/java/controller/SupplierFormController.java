package controller;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import db.DBConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.Supplier;
import model.tm.SupplierTm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

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
    private JFXTreeTableView<SupplierTm> supplierMainTable;

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
    private Label labelId;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadTable();
        showId();
        colSupId.setCellValueFactory(new TreeItemPropertyValueFactory<>("supplier_id"));
        colSupName.setCellValueFactory(new TreeItemPropertyValueFactory<>("name"));
        colSupContact.setCellValueFactory(new TreeItemPropertyValueFactory<>("contact"));
        colSupEmail.setCellValueFactory(new TreeItemPropertyValueFactory<>("email"));
        colSupCompany.setCellValueFactory(new TreeItemPropertyValueFactory<>("company"));
        colSupTitle.setCellValueFactory(new TreeItemPropertyValueFactory<>("title"));
        colSupOption.setCellValueFactory(new TreeItemPropertyValueFactory<>("btn"));


    }

public void showId(){
    /*try {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("SELECT supplier_id FROM suppliers ORDER BY id DESC LIMIT 1");
        ResultSet resultSet = pstm.executeQuery();
        if (resultSet.next()){
            int num = resultSet.getInt(1);
            num++;
            //labelId.setText(String.format("S%03d",num));
        }else {
           labelId.setText("S001");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }   */
}


  private void loadTable() {

        ObservableList<SupplierTm> tmList = FXCollections.observableArrayList();
        try {
            List<Supplier> list = new ArrayList<>();
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement pstm = connection.prepareStatement("SELECT * FROM suppliers");
            ResultSet resultSet = pstm.executeQuery();

            while (resultSet.next()) {
                list.add(new Supplier(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6)
                ));
            }



            for (Supplier supplier:list) {
                JFXButton btn = new JFXButton("Delete");
                btn.setBackground(Background.fill(Color.rgb(227,92,92)));
                btn.setTextFill(Color.rgb(255,255,255));
                btn.setStyle("-fx-font-weight: BOLD");

                btn.setOnAction(actionEvent -> {
                    try {
                        PreparedStatement pst = connection.prepareStatement("DELETE FROM suppliers WHERE supplier_id=?");
                        pst.setInt(1,supplier.getSupplier_id());
                        Optional<ButtonType> buttonType = new Alert(Alert.AlertType.CONFIRMATION, "Do you want to delete " + supplier.getSupplier_id() + " Supplier ? ", ButtonType.YES, ButtonType.NO).showAndWait();
                        if (buttonType.get() == ButtonType.YES){
                            if (pst.executeUpdate()>0){
                                new Alert(Alert.AlertType.INFORMATION,"Supplier Deleted..!").show();
                                loadTable();

                            }else{
                                new Alert(Alert.AlertType.ERROR,"Something went wrong..!").show();
                            }
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                });

                tmList.add(new SupplierTm(
                        supplier.getSupplier_id(),
                        supplier.getName(),
                        supplier.getCompany(),
                        supplier.getEmail(),
                        supplier.getTitle(),
                        supplier.getContact(),
                        btn
                ));
            }

            TreeItem<SupplierTm> treeItem = new RecursiveTreeItem<>(tmList, RecursiveTreeObject::getChildren);
            supplierMainTable.setRoot(treeItem);
            supplierMainTable.setShowRoot(false);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
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
                new Alert(Alert.AlertType.INFORMATION,"Supplier Saved.....!").show();

            }else{
                new Alert(Alert.AlertType.ERROR,"Something went wrong.....!").show();
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
