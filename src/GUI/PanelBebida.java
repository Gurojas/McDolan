/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

/**
 *
 * @author Usuario
 */
public class PanelBebida extends GridPane{
    
    private ImageView imagen;
    private Button botonSeleccionar;
    private TextFlow panelDescripcion;
    private Text textoDescripcion;
    private Text textoNombre;
    private Text textoPrecio;
   
    
    public PanelBebida(String nombre, String descripcion, int precio, String urlImage){
        

        this.setGridLinesVisible(false);
        this.setPrefWidth(750);
        
       
        
        this.imagen = new ImageView(urlImage);
        this.imagen.setFitWidth(120);
        this.imagen.setFitHeight(100);
        
        this.botonSeleccionar = new Button("Seleccionar");
        this.botonSeleccionar.setId("botonesBebidas");
        
        this.textoNombre = new Text(nombre);
        
        this.textoDescripcion = new Text("Descripcion: "+descripcion);
        
        this.textoPrecio = new Text("Precio: $"+String.valueOf(precio));
        
        this.panelDescripcion = new TextFlow(this.textoDescripcion);

        VBox v = new VBox(5);
        v.setPadding(new Insets(5));
        v.setAlignment(Pos.CENTER_RIGHT);
        
        v.getChildren().addAll(this.panelDescripcion,this.textoPrecio,this.botonSeleccionar);
        
        this.add(this.textoNombre,0,0);
        this.add(this.imagen,0,1);
        this.add(v,1,1);

        
        this.botonSeleccionar.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                MenuExtras menuExtras = new MenuExtras();
            }
        });
    
    }
    
}
