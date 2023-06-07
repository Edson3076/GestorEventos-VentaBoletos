/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controler;

import gestoreventos_ventaboletos.Evento;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class EventosController implements Initializable {

    @FXML
    private Button btnCrearEvento;
    @FXML
    private Button btnRegresar;
    
    private Menu1VistaController menu1Vistacontroller;
    private Stage stage;
    @FXML
    private TextField txtNombreEvento;
    @FXML
    private TextField txtResponsable;
    @FXML
    private TextField txtHoraInicio;
    @FXML
    private TextField txtHoraFin;
    @FXML
    private TextField txtSinopsis;
    @FXML
    private DatePicker dateFecha;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CrearEvento(ActionEvent event) {
        try {
            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/ConfirmarEventoVista.fxml"));
            Parent root = loader.load();
            ConfirmarEventoController controlador = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            controlador.init(dateFecha,txtNombreEvento.getText(),txtResponsable.getText(),txtHoraInicio.getText(),txtHoraFin.getText(),txtSinopsis.getText(), stage, this);
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

    void init(Stage stage, Menu1VistaController menu1VistaController) {
        this.menu1Vistacontroller = menu1VistaController;
        this.stage = stage;
    }

    void show() {
        stage.show();
    }

}
