/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controler;

import gestoreventos_ventaboletos.Evento;
import java.io.File;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

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
    private PrecioBoletosController precioBoletosController;
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
    private Button btnSubirImagen;
    @FXML
    private ImageView imageView;
    @FXML
    private Button btnprecios;
    @FXML
    private Label lblVIP_MG;
    @FXML
    private Label lblVIP;
    @FXML
    private Label lblPlateaA;
    @FXML
    private Label lblPlateaB;
    @FXML
    private TextField txtHoraDisponible;
    @FXML
    private TextField txtHoraNoDisponible;
    @FXML
    private TextField txtFecha;
    @FXML
    private TextField txtFechaDisponible;
    @FXML
    private TextField txtFechaNoDisponible;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    public void CrearEvento(ActionEvent event) {
        try {
            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/ConfirmarEventoVista.fxml"));
            Parent root = loader.load();
            ConfirmarEventoController controlador = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            controlador.ConfirmarEventoController(txtNombreEvento.getText(),txtFecha.getText(), txtHoraInicio.getText(),txtHoraFin.getText(),
                    txtSinopsis.getText(),txtFechaDisponible.getText(),txtHoraDisponible.getText(),txtFechaNoDisponible.getText(),
                    txtHoraNoDisponible.getText(),txtResponsable.getText(),lblVIP_MG.getText(),lblVIP.getText(),lblPlateaA.getText(),lblPlateaB.getText(),
                    stage, this);
            stage.show();
            this.stage.close();
        } catch (IOException ex) {
            Logger.getLogger(LoginVistaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void precioBoletos(ActionEvent event) {
        try {
            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/PrecioBoletosVista.fxml"));
            Parent root = loader.load();
            PrecioBoletosController controlador = loader.getController();
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
    
    @FXML
    public void seleccionarImagen(ActionEvent event) {
        FileChooser archivo  = new  FileChooser();
        archivo.setTitle("Seleccionar imagen");
        FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("Archivos de imagen", "*.png", "*.jpg", "*.jpeg", "*.gif");
        archivo.getExtensionFilters().add(imageFilter);
        File imagenSeleccionada = archivo.showOpenDialog(null);
        if (imagenSeleccionada != null) {
            Image imagen = new Image(imagenSeleccionada.toURI().toString());
            imageView.setImage(imagen);
            imageView.setFitWidth(200);
            imageView.setFitHeight(200);
        }
    }
    
    @FXML
    public void Regresar(ActionEvent event) {
        menu1Vistacontroller.show();
        stage.close();
    }
    
    public void init(Stage stage, Menu1VistaController menu1VistaController) {
        this.menu1Vistacontroller = menu1VistaController;
        this.stage = stage;
    }
    public void init1(String VIP_MG, String VIP, String PlateaA,String PlateaB, Stage stage, PrecioBoletosController precioBoletosController){
      lblVIP_MG.setText(VIP_MG);
      lblVIP.setText(VIP);
      lblPlateaA.setText(PlateaA);
      lblPlateaB.setText(PlateaB);
    }
    
    void show() {
        stage.show();
    }
}
