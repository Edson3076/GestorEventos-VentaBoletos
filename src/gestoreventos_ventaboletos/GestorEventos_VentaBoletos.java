/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestoreventos_ventaboletos;

/**
 *
 * @author HP
 */
public class GestorEventos_VentaBoletos {
    private String nombreEvento;
    private String nombreResponsable;
    Evento e = new Evento(nombreEvento,nombreResponsable);
    
    public GestorEventos_VentaBoletos(String nombreEvento, String nombreResponsable) {
        this.e = new Evento(nombreEvento,nombreResponsable);
        //e.mostrar();
    }
    
}
