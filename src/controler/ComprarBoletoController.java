/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controler;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class ComprarBoletoController implements Initializable {

    private Menu1VistaController menu1Vistacontroller;
    private Stage stage;
    @FXML
    private Label lblVip_mg;
    @FXML
    private Label lblVip;
    @FXML
    private Label lblPlateaA;
    @FXML
    private Label lblPlateaB;
    @FXML
    private TextField txtCantidadBoletos;
    @FXML
    private Button btnRegresar;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    void init(Stage stage, Menu1VistaController menu1VistaController) {
        this.menu1Vistacontroller = menu1VistaController;
        this.stage = stage;
    }

    @FXML
    private void Regresar(ActionEvent event) {
        menu1Vistacontroller.show();
        stage.close();
    }
    
}
