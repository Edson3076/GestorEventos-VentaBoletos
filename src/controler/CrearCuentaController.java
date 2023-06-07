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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class CrearCuentaController implements Initializable {

    @FXML
    private Button btnCrear;
    @FXML
    private Button btnRegresar;
    private LoginVistaController loginVistaController;
    private Stage stage;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void crearUsuario(ActionEvent event) {
    }

    @FXML
    private void Regresar(ActionEvent event) {
        loginVistaController.show();
        stage.close();
    }

    void init(Stage stage, LoginVistaController loginVistaController) {
        this.loginVistaController = loginVistaController;
        this.stage = stage;
    }
    
}
