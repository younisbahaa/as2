/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Admin;

import Model.Accounts;
import Model.User;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 *
 * @author Yuns
 */
public class UpdateAccountsController {
    @FXML
    private Button usersManagmentPageBtn;
    @FXML
    private Button accountsPageBtn;
    @FXML
    private Button operationsPageBtn;
    @FXML
    private Button saveNewUserBtn;
    @FXML
    private Button cancelBtn;
   
    @FXML
    private TextField acTF;
     @FXML
    private TextField usernameTF;
    @FXML
    private TextField currencyTF;
     @FXML
    private TextField balanceTF;
    @FXML
    private TextField cdTF;
    
     private void updateAccounts(ActionEvent event) throws SQLException, ClassNotFoundException {
        
  String username = usernameTF.getText();
int num = Integer.parseInt(acTF.getText());
String currency = currencyTF.getText();
String date = cdTF.getText();
double balance = Double.parseDouble(balanceTF.getText());

Accounts user = new Accounts(null, 0, num, username, currency, balance);

        Controller.Admin.UsersManagmentController.updateStage.close();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Accounts updated");
        alert.setContentText("Accounts updated");
        alert.showAndWait();
    }
}
