/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controler;

import gestoreventos_ventaboletos.Evento;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class Menu1VistaController implements Initializable {

    @FXML
    private Label Titulo;

    private Stage stage;
    private TextField txtusuario;
    @FXML
    private Button btnCartelera;
    @FXML
    private Button btnLogin;
    @FXML
    private TableView<Evento> tblEventos;
    @FXML
    private TableColumn colEvento;
    @FXML
    private Button btnCrearEvento;
    @FXML
    private TableColumn colFecha;
    
    private ObservableList<Evento> eventos;
    private ConfirmarEventoController instancia = new ConfirmarEventoController();
    private ArrayList<Evento> listaEventos;
    
    ArrayList<Evento> listaEvento;
    @FXML
    private Button btnComprar;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }  
    
    public void setStage(Stage primaryStage){
        stage = primaryStage;
    }

    void show() {
        stage.show();
    }
    
    public void agregarEvento(ActionEvent event) {
//        ArrayList<Evento> listaE = instancia.getLista();
//            for(Evento e: listaE){
//            System.out.println(e.toString());
//        }

        
    }
    

    @FXML
    public void Eventos(ActionEvent event) {
        try {
            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/EventosVista.fxml"));
            Parent root = loader.load();
            EventosController controlador = loader.getController();
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
    private void Login(ActionEvent event) {
        try {
            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/LoginVista.fxml"));
            Parent root = loader.load();
            LoginVistaController controlador = loader.getController();
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
    private void Cartelera(ActionEvent event) {
        try {
            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/CarteleraVista.fxml"));
            Parent root = loader.load();
            CarteleraController controlador = loader.getController();
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
    private void comprarBoleto(ActionEvent event) {
        try {
            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/comprarBoletoVista.fxml"));
            Parent root = loader.load();
            ComprarBoletoController controlador = loader.getController();
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

    
}
