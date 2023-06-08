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
    private String fecha;
    private String horaInicio;
    private String horaFin;
    private String sinopsis;
    private String fechaDisponible;
    private String horaDisponible;
    private String fechaNoDisponible;
    private String horaNoDisponible;
    private String responsable;
    private String vip_mg;
    private String vip;
    private String plateaA;
    private String plateaB;

    public Evento(String nombreEvento, String fecha, String horaInicio, String horaFin, String sinopsis, String fechaDisponible, 
            String horaDisponible, String fechaNoDisponible, String horaNoDisponible, String responsable, String vip_mg, String vip, String plateaA, String plateaB) {
        this.nombreEvento = nombreEvento;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.sinopsis = sinopsis;
        this.fechaDisponible = fechaDisponible;
        this.horaDisponible = horaDisponible;
        this.fechaNoDisponible = fechaNoDisponible;
        this.horaNoDisponible = horaNoDisponible;
        this.responsable = responsable;
        this.vip_mg = vip_mg;
        this.vip = vip;
        this.plateaA = plateaA;
        this.plateaB = plateaB;
    }

    
    public Evento(){}
    
    public void mostrar(){
        System.out.println("nombre: "+nombreEvento);
        System.out.println("fecha: "+ fecha);
        System.out.println("hora inicio: "+horaInicio);
        System.out.println("hora fin: "+ horaFin);
        System.out.println("Sinopsis"+ sinopsis);
        System.out.println("Fecha Disponible: "+fechaDisponible);
        System.out.println("Hora Disponible: "+ horaDisponible);
        System.out.println("fechaNoDisponible: "+fechaNoDisponible);
        System.out.println("horaNoDisponible: "+horaNoDisponible);
        System.out.println("responsable: "+responsable);
        System.out.println("Precio: vip_mg: "+vip_mg);
        System.out.println("Precio vip: "+vip);
        System.out.println("precio plateaA: "+plateaA);
        System.out.println("Precio plateaB: "+plateaB);
        
    }
}
