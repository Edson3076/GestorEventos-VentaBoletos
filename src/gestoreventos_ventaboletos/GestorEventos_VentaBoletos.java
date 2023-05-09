/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package gestoreventos_ventaboletos;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class GestorEventos_VentaBoletos extends Application {
    //INIT
    @Override
    public void init(){
    System.out.println("Metodo init");
    }
    
    //START
    @Override
    public void start(Stage primaryStage) {
       
        Button btn = new Button();
        btn.setText("Click'");
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hola mundo!");
        primaryStage.setScene(scene);
        primaryStage.show();
        System.out.println("Metodo star");
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("nada");
                Platform.exit();
            }
        });
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
