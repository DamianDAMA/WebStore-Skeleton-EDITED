/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.controllers;

import fx.controllers.purchases.*;
import fx.controllers.reviews.*;
import fx.controllers.customers.*;
import fx.controllers.items.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Laura
 */
public class FXMLPrincipalController implements Initializable {

    //Reference to the top menu to change its visibility when needed.
    @FXML
    private BorderPane fxRoot;

    public void setFxRoot(BorderPane fxRoot) {
        this.fxRoot = fxRoot;
    }

    @FXML
    private MenuBar fxMenuTop;

    // Get y set of the user to use it wherever we need it
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // References to other panes to load them and access their controllers
    private AnchorPane login;
    private FXMLLoginController loginController;
    private AnchorPane welcome;
    private FXMLWelcomeController welcomeController;

    private AnchorPane purchases;
    private FXMLPurchasesController purchasesController;
    private AnchorPane datePurchases;
    private FXMLDatePurchasesController datePurchasesController;
    private AnchorPane delete;
    private FXMLDeleteController deleteController;

    private AnchorPane addCustomer;
    private FXMLAddCustomerController addCustomerController;
    private AnchorPane findCustomer;
    private FXMLfindCustomerController findCustomerController;
    private AnchorPane deleteCustomer;
    private FXMLdeleteCustomerController deleteCustomerController;

    private AnchorPane addReview;
    private FXMLAddReviewController addReviewController;
    private AnchorPane findReview;
    private FXMLfindReviewController findReviewController;
    private AnchorPane deleteReview;
    private FXMLdeleteReviewController deleteReviewController;

    private AnchorPane listItems;
    private FXMLListItemsController listItemsController;

    private AnchorPane AddItems;
    private FXMLAddItemsController AddItemsController;

    public void preloadLogin() {
        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/FXMLLogin.fxml"));
            login = loaderMenu.load();
            loginController
                    = loaderMenu.getController();

            loginController.setPrincipal(this);
        } catch (IOException ex) {
            Logger.getLogger(FXMLPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void preloadWelcome() {
        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/FXMLWelcome.fxml"));
            welcome = loaderMenu.load();
            welcomeController = loaderMenu.getController();

        } catch (IOException ex) {
            Logger.getLogger(FXMLPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void preloadPurchases() {
        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/purchases/FXMLPurchases.fxml"));
            purchases = loaderMenu.load();
            purchasesController = loaderMenu.getController();

        } catch (IOException ex) {
            Logger.getLogger(FXMLPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void preloadDatePurchases() {
        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/purchases/FXMLDatePurchases.fxml"));
            datePurchases = loaderMenu.load();
            datePurchasesController = loaderMenu.getController();

        } catch (IOException ex) {
            Logger.getLogger(FXMLPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void preloadDelete() {

        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/purchases/FXMLDelete.fxml"));
            delete = loaderMenu.load();
            deleteController = loaderMenu.getController();

        } catch (IOException ex) {
            Logger.getLogger(FXMLPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void preloadAddCustomer() {

        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/customers/FXMLAddCustomer.fxml"));
            addCustomer = loaderMenu.load();
            addCustomerController = loaderMenu.getController();

        } catch (IOException ex) {
            Logger.getLogger(FXMLPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void preloadFindCustomer() {

        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/customers/FXMLfindCustomer.fxml"));
            findCustomer = loaderMenu.load();
            findCustomerController = loaderMenu.getController();

        } catch (IOException ex) {
            Logger.getLogger(FXMLPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void preloadDeleteCustomer() {

        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/customers/FXMLdeleteCustomer.fxml"));
            deleteCustomer = loaderMenu.load();
            deleteCustomerController = loaderMenu.getController();

        } catch (IOException ex) {
            Logger.getLogger(FXMLPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void preloadAddReview() {

        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/reviews/FXMLaddReview.fxml"));
            addReview = loaderMenu.load();
            addReviewController = loaderMenu.getController();

        } catch (IOException ex) {
            Logger.getLogger(FXMLPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void preloadFindReview() {

        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/reviews/FXMLfindReview.fxml"));
            findReview = loaderMenu.load();
            findReviewController = loaderMenu.getController();

        } catch (IOException ex) {
            Logger.getLogger(FXMLPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void preloadDeleteReview() {

        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/reviews/FXMLdeleteReview.fxml"));
            deleteReview = loaderMenu.load();
            deleteReviewController = loaderMenu.getController();

        } catch (IOException ex) {
            Logger.getLogger(FXMLPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void preloadListItems() {

        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/items/FXMLListItems.fxml"));
            listItems = loaderMenu.load();
            listItemsController = loaderMenu.getController();

        } catch (IOException ex) {
            Logger.getLogger(FXMLPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    public void preloadAddItems() {
        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/items/FXMLAddItems.fxml"));
            AddItems = loaderMenu.load();
            AddItemsController = loaderMenu.getController();

        } catch (IOException ex) {
            Logger.getLogger(FXMLPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void chargeLogin() {
        fxRoot.setCenter(login);
        fxMenuTop.setVisible(false);
    }
    public void chargeWelcome() {
        welcomeController.setLogin(this.getUsername());
        fxMenuTop.setVisible(true);
        fxRoot.setCenter(welcome);
    }
    
    public void chargePurchases() {
        purchasesController.load();
        fxRoot.setCenter(purchases);
    }
    public void chargeDatePurchases() {
        datePurchasesController.loadPurchasesList();
        fxRoot.setCenter(datePurchases);
    }
    public void chargeDelete() {
        deleteController.loadPurchases();
        fxRoot.setCenter(delete);
    }

    public void chargeAddCustomer() {
        addCustomerController.loadCustomersList();
        fxRoot.setCenter(addCustomer);
    }
    public void chargeFindCustomer() {

        fxRoot.setCenter(findCustomer);
    }
    public void chargeDeleteCustomer() {
        deleteCustomerController.loadCustomersList();
        fxRoot.setCenter(deleteCustomer);
    }

    public void chargeAddReview() {
        addReviewController.loadCustomers();
        fxRoot.setCenter(addReview);
    }
    public void chargeDeleteReview() {
        deleteReviewController.loadCustomersList();
        fxRoot.setCenter(deleteReview);
    }
    public void chargeFindReview() {
        findReviewController.loadItems();
        fxRoot.setCenter(findReview);
    }

    public void listItems(ActionEvent actionEvent) {
        listItemsController.loadItemsList();
        fxRoot.setCenter(listItems);
    }

    public void AddItems(ActionEvent actionEvent) {
        AddItemsController.loadItemsList();
        fxRoot.setCenter(AddItems);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        preloadWelcome();
        preloadLogin();

        preloadPurchases();
        preloadDatePurchases();
        preloadDelete();

        preloadAddCustomer();
        preloadFindCustomer();
        preloadDeleteCustomer();

        preloadAddReview();
        preloadDeleteReview();
        preloadFindReview();

        preloadListItems();
        preloadAddItems();

        chargeLogin();

    }



}
