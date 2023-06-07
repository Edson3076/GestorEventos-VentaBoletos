/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestoreventos_ventaboletos;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Evento {
    private String nombreEvento;
    private Date fecha;
    private Time horaInicio;
    private Time horaFin;
    private String Sinopsis;
    private Float precio;
    private String Responsable;

    public Evento(String nombreEvento, String nombreResponsable) {
        this.nombreEvento = nombreEvento;
        this.Responsable = nombreResponsable;
    }
    
    public void mostrar(){
        System.out.println(nombreEvento);
        System.out.println(Responsable);
    }
}
