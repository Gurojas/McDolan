/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javafx.geometry.HPos;
import javafx.scene.control.CheckBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 *
 * @author Usuario
 */
public class PanelExtra extends GridPane{
    
    private ImageView imagen;
    private CheckBox selector;
    private Text textoNombre;
    private Text textoPrecio;
    
    public PanelExtra(String nombre, int precio, String imageUrl){
        
        this.setGridLinesVisible(true);
        this.setPrefWidth(500);
        
        
        this.imagen = new ImageView(imageUrl);
        this.imagen.setFitWidth(120);
        this.imagen.setFitHeight(100);
        
        this.selector = new CheckBox();
        
        this.textoNombre = new Text(nombre);
        
        this.textoPrecio = new Text("Precio: $"+String.valueOf(precio));
        
        
        this.add(this.textoNombre,0,0);
        this.add(this.imagen, 0, 1);
        
        this.add(this.selector,1,1);
        GridPane.setHalignment(this.selector, HPos.RIGHT);
        
        this.add(this.textoPrecio,1,2);
    
    }
    
}
