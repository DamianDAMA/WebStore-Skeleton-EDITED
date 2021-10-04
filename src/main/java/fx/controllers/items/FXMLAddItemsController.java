package fx.controllers.items;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.Item;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FXMLAddItemsController implements Initializable {

    @FXML
    public ListView itemList;
    @FXML
    public TextField idBox;
    @FXML
    public TextField nameBox;
    @FXML
    public TextField companyBox;
    @FXML
    public TextField priceBox;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadItemsList();
    }

    public void addItem(ActionEvent actionEvent) {
        Item articulo = new Item();

        try{
            articulo.setIdItem(Integer.parseInt(idBox.getText()));
            articulo.setName(nameBox.getText());
            articulo.setCompany(companyBox.getText());
            articulo.setPrice(Double.parseDouble(priceBox.getText()));
            itemList.getItems().add(articulo);

        } catch (Exception e) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setContentText("Faltan datos, inténtalo de nuevo");
        alerta.showAndWait();
    }

        try {
            // Creates a FileWriter
            FileWriter file = new FileWriter("Text.txt");
            // Creates a BufferedWriter
            BufferedWriter output = new BufferedWriter(file);
            // Writes the string to the file
            output.write(articulo.toString());
            // Closes the writer
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }


    }

    public void loadItemsList(){

    }
}
