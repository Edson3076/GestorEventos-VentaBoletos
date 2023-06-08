/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controler;

import gestoreventos_ventaboletos.Evento;
import gestoreventos_ventaboletos.GestorEventos_VentaBoletos;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.StringConverter;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class ConfirmarEventoController implements Initializable {
    private EventosController eventosController;
    private Menu1VistaController menu1Vistacontroller;
    private Stage stage;
    
    private String nombreEvento;
    private String fecha;
    private String horaInicio;
    private String horaFin;
    private String Sinopsis;
    private String fechaDisponible;
    private String horaDisponible;
    private String fechaNoDisponible;
    private String horaNoDisponible;
    private String responsable;
    private String vip_mg;
    private String vip;
    private String plateaA;
    private String plateaB;
    
    @FXML
    private Button btnConfirmarEvento;
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
    private void NuevoEvento(ActionEvent event) {
        Evento e = new Evento(nombreEvento,fecha,horaInicio,horaFin,Sinopsis,fechaDisponible,horaDisponible,fechaNoDisponible,
                horaNoDisponible, responsable,vip_mg,vip,plateaA,plateaB);
        e.mostrar();
        //mandar el vento a la pagina principal
        eventosController.show();
        stage.close();
    }

    @FXML
    private void Regresar(ActionEvent event) {
        eventosController.show();
        stage.close();
    }

    public void ConfirmarEventoController(String nombreEvento,String fecha, String horaInicio,String horaFin,String Sinopsis,
            String fechaDisponible, String horaDisponible, String fechaNoDisponible, String horaNoDisponible, String responsable,
            String vip_mg, String vip, String plateaA,String plateaB,
            Stage stage, EventosController eventosController) {
        this.nombreEvento = nombreEvento;
        this.fecha = fecha;
        this.horaInicio =horaInicio;
        this.horaFin = horaFin;
        this.Sinopsis = Sinopsis;
        this.fechaDisponible = fechaDisponible;
        this.horaDisponible = horaDisponible;
        this.fechaNoDisponible = fechaNoDisponible;
        this.horaNoDisponible = horaNoDisponible;
        this.responsable = responsable;
        this.vip_mg = vip_mg;
        this.vip = vip;
        this.plateaA = plateaA;
        this.plateaB = plateaB;
        this.eventosController = eventosController;
        this.stage = stage;
    }
    
}
