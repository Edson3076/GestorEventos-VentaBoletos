/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controler;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class PrecioBoletosController implements Initializable {
    private EventosController eventosController;
    private Stage stage;
    @FXML
    private TextField txtVIP_MG;
    @FXML
    private TextField txtvip;
    @FXML
    private TextField txtplateaA;
    @FXML
    private TextField txtPlateaB;
    @FXML
    private Button btnAceptar;
    @FXML
    private Button btnRegresar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    public void aceptar(ActionEvent event) {
        eventosController.init1( txtVIP_MG.getText(),txtvip.getText(),txtplateaA.getText(),txtPlateaB.getText(), stage, this);
        eventosController.show();
        stage.close();
    }

    @FXML
    public void Regresar(ActionEvent event) {
        eventosController.show();
        stage.close();
    }
    
    public void init(Stage stage, EventosController eventosController) {
        this.eventosController = eventosController;
        this.stage = stage;
    }
    
}
