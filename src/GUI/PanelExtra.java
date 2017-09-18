/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.scene.control.CheckBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

/**
 *
 * @author Usuario
 */
public class PanelExtra extends GridPane{
    
    private ImageView imagen;
    public CheckBox selector;
    private Text textoNombre;
    private Text textoPrecio;
    
    public PanelExtra(String nombre, int precio, String imageUrl){
        
        this.setGridLinesVisible(!true);
        
        
        
        this.imagen = new ImageView(imageUrl);
        this.imagen.setFitWidth(120);
        this.imagen.setFitHeight(100);
        
        this.selector = new CheckBox();
      
        this.selector.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (selector.isSelected()){
                    PanelVenta.lista.getItems().add(nombre+"     "+precio);
                    int acumulador = PanelVenta.acumulador;
                    PanelVenta.textoTotal.setText("Total a pagar: $"+String.valueOf(PanelVenta.acumulador = acumulador + precio));
                }
                else{
                    PanelVenta.lista.getItems().remove(nombre+"     "+precio);
                    int acumulador = PanelVenta.acumulador;
                    PanelVenta.textoTotal.setText("Total a pagar: $"+String.valueOf(PanelVenta.acumulador = acumulador - precio));
                }
            }
        });
        
        this.textoNombre = new Text(nombre);
        this.textoNombre.setId("textoTitulo");
        
        this.textoPrecio = new Text("Precio: $"+String.valueOf(precio));
        this.textoPrecio.setId("textoPrecio");
        
        
        this.add(this.textoNombre,0,0);
        this.add(this.imagen, 0, 1);
        
        this.add(this.selector,1,1);
        GridPane.setHalignment(this.selector, HPos.RIGHT);
        
        this.add(this.textoPrecio,1,2);
    
    }
    
}
