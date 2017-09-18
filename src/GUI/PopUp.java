/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class PopUp extends Stage{
    
    public Button botonAviso;
    public Text textoInformacion;
    public int total;
    
    public PopUp(int total){
        
        this.setResizable(false);
        this.setTitle("Mensaje pago");
        this.initModality(Modality.APPLICATION_MODAL);
        this.getIcons().add(new ImageView("/imagen/logo.png").getImage());
        
        BorderPane panel = new BorderPane();
        panel.setId("borderpane");
        
        panel.setPadding(new Insets(10));
        
        Scene scene = new Scene(panel,300,100);
        scene.getStylesheets().add("/estilos/estilos.css");
        
        this.setScene(scene);
        
        this.botonAviso = new Button("Ok");
        this.botonAviso.setId("botones");
        
        this.botonAviso.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                cerrar();
                MenuBebidas.cambiarEscena();
                PanelVenta.acumulador = 0;
            }
        });
        
        this.textoInformacion = new Text("Total a pagar: $"+String.valueOf(total));
        this.textoInformacion.setId("textoTitulo");
        
        panel.setCenter(this.textoInformacion);
        BorderPane.setAlignment(this.textoInformacion, Pos.CENTER_LEFT);
        
        panel.setBottom(this.botonAviso);
        BorderPane.setAlignment(this.botonAviso, Pos.CENTER_RIGHT);
        
    
    } 
    
    public void mostrar(){
        this.show();
    }
    
    private void cerrar(){
        this.close();
    }
    
}
