/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

/**
 *
 * @author Usuario
 */
public class PanelVenta extends GridPane{
    
    private Text titulo;
    public static ListView<String> lista;
    private Button botonPagar;
    public static Text textoTotal;
    
    public static int acumulador = 0;
    
    public PanelVenta(){
        
        this.setGridLinesVisible(!true);
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(10));
        this.setVgap(5);
        
        this.titulo = new Text("Lista de productos");
        this.titulo.setId("textoCategoria");
        
        this.lista = new ListView<>();
        
        this.botonPagar = new Button("Pagar");
        this.botonPagar.setId("botones");
        
        this.textoTotal = new Text("Total a pagar: $");
        this.textoTotal.setId("textoPrecio");
        
        this.add(this.titulo,0,0);
        this.add(this.lista, 0,1);
        
        this.add(this.textoTotal,0,2);
        GridPane.setHalignment(this.textoTotal, HPos.RIGHT);
        
        this.add(this.botonPagar,0,3);
        GridPane.setHalignment(this.botonPagar, HPos.RIGHT);
        
        
    }
    

    
}
