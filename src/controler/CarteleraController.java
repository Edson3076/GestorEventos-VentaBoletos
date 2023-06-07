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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class CarteleraController implements Initializable {

    private Menu1VistaController menu1Vistacontroller;
    private Stage stage;
    @FXML
    private Button btnLogin;
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
    private void Login(ActionEvent event) {
        try {
            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/LoginVista.fxml"));
            Parent root = loader.load();
            LoginVistaController controlador = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            //controlador.init(stage, this); 
            stage.show();
            this.stage.close();
        } catch (IOException ex) {
            Logger.getLogger(LoginVistaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void Regresar(ActionEvent event) {
        menu1Vistacontroller.show();
        stage.close();
    }

    void show() {
        stage.showAndWait();
    }
    
}
