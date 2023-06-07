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
    private DatePicker fechas;
    
    @FXML
    private Button btnConfirmarEvento;
    @FXML
    private Button btnRegresar;
    @FXML
    private Label lblNombreEvento;
    @FXML
    private Label lblResponsable;
    @FXML
    private Label lblFecha;
    @FXML
    private Label lblHoraInicio;
    @FXML
    private Label lblHoraFin;
    @FXML
    private Label lblSinopsis;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void NuevoEvento(ActionEvent event) {
//        Evento e = new Evento(lblNombreEvento.getText());
//        e.mostrar();
        GestorEventos_VentaBoletos e= new GestorEventos_VentaBoletos(lblNombreEvento.getText(),lblResponsable.getText());
        eventosController.show();
        stage.close();
    }

    @FXML
    private void Regresar(ActionEvent event) {
        eventosController.show();
        stage.close();
    }

    void init(DatePicker fechas,String nombreEvento,String responsable,String HoraInicio,String HoraFin,String Sinopsis, Stage stage, EventosController eventosController) {
        lblNombreEvento.setText(nombreEvento);
        lblResponsable.setText(responsable);        
        lblHoraInicio.setText(HoraInicio);
        lblHoraFin.setText(HoraFin);
        lblSinopsis.setText(Sinopsis);
        this.eventosController = eventosController;
        this.stage = stage;
    }
    public void convertirFecha(){
        LocalDate fechaSeleccionada = fechas.getValue();
        String f = fechaSeleccionada.format(DateTimeFormatter.ofPattern("dd/mm/yyyy"));
        System.out.println(f);
    }
    
}
