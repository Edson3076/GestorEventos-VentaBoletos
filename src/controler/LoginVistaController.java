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
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class LoginVistaController implements Initializable {

    @FXML
    private Button btnIngresar;
    @FXML
    private Button btnRegresar;
    
    private CarteleraController carteleraController;
    private Menu1VistaController menu1VistaController;
    private Stage stage;
    
    @FXML
    private TextField txtusuario;
    @FXML
    private Hyperlink linkcrearCuenta;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Ingresar(ActionEvent event) {
    }

    @FXML
    private void Regresar(ActionEvent event) {
        menu1VistaController.show();
        stage.close();
    }
   
    public void init(Stage stage, Menu1VistaController menu1VistaController){
        this.menu1VistaController = menu1VistaController;
        this.stage = stage;
    }

    @FXML
    private void CrearCuenta(ActionEvent event) {
        try {
            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/CrearCuentaVista.fxml"));
            Parent root = loader.load();
            CrearCuentaController controlador = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            controlador.init(stage, this); 
            stage.show();
            this.stage.close();
        } catch (IOException ex) {
            Logger.getLogger(LoginVistaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void show() {
        stage.show();
    }
    
}
