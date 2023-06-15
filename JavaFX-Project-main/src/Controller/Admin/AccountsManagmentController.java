/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Admin;

import Model.Accounts;
import View.ViewManager;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Yahya
 */
public class AccountsManagmentController implements Initializable {

    @FXML
    private Button usersManagmentPageBtn;
    @FXML
    private Button accountsPageBtn;
    @FXML
    private Button operationsPageBtn;
    @FXML
    private Button createNewAccountrBtn;
    @FXML
    private Button showAllAccountsBtn;
    @FXML
    private Button updateSelectedAccountBtn;
    @FXML
    private Button deleteSelectedAccountBtn;
    @FXML
    private Button searchAccountBtn;
    @FXML
    private TextField accontSearchTF;
@FXML
     private TableView<Accounts> AccountsTableView;
    private TableColumn<Accounts, Integer> a;
    @FXML
    private TableColumn<Accounts, Integer> b;
    @FXML
    private TableColumn<Accounts, String> c;
    @FXML
    private TableColumn<Accounts, String> d;
    @FXML
    private TableColumn<Accounts, Double> e;
    @FXML
    private TableColumn<Accounts, String> f;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   a.setCellValueFactory(new PropertyValueFactory("id"));
        b.setCellValueFactory(new PropertyValueFactory("account_number"));
        c.setCellValueFactory(new PropertyValueFactory("username"));
        d.setCellValueFactory(new PropertyValueFactory("currency"));
        e.setCellValueFactory(new PropertyValueFactory("balance"));
        f.setCellValueFactory(new PropertyValueFactory("creation_date"));    }    


    @FXML
    private void showUsersManagmentPage(ActionEvent event) {
         ViewManager.adminPage.changeSceneToUsersManagment();
    }

    @FXML
    private void showAccountsPage(ActionEvent event) {
    }

    @FXML
    private void showOperationsPage(ActionEvent event) {
       
    }

    @FXML
    private void showAccountCreationPage(ActionEvent event) {
    }

    @FXML
    private void showAllAccounts(ActionEvent event) {
    }

    @FXML
    private void updateSelectedAccount(ActionEvent event) {
    }

    @FXML
    private void deleteSelectedAccount(ActionEvent event) {
    }

    @FXML
    private void searchForAnAccount(ActionEvent event) {
    }
    
}
