/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package controler;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class Main extends Application {
    //INIT
    @Override
    public void init(){
    System.out.println("Metodo init");
    }
    
    //START
    @Override
    public void start(Stage primarystage) {   
        try {
            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/Menu1Vista.fxml"));
            Pane ventana = (Pane) loader.load();
            Scene scene = new Scene(ventana);
            primarystage.setScene(scene);
            Menu1VistaController controlador = loader.getController();
            controlador.setStage(primarystage);
            primarystage.show();
            
            //primarystage.show();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
    
    //STOP
    @Override
    public void stop(){
    System.out.println("Metodo stop");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
