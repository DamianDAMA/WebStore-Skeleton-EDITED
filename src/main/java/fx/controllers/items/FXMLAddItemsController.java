package fx.controllers.items;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

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
    public TextField phoneBox;
    @FXML
    public TextField addressBox;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadItemsList();
    }

    public void addItem(ActionEvent actionEvent) {

    }

    public void loadItemsList(){

    }
}
