/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author Usuario
 */
public class MenuExtras {
    
    private Scene scene;
    private BorderPane mainPanel;
    private ScrollPane panelScroll;
    private ImageView logo;
    private VBox centerPanel;
    
    public MenuExtras(){
        
        this.mainPanel = new BorderPane();
        this.mainPanel.setPadding(new Insets(10));
        
        this.scene = new Scene(mainPanel,800,600);
        this.scene.getStylesheets().add("estilos/estilos.css");
        
        MenuBebidas.stage.setScene(scene);
        MenuBebidas.stage.setTitle("McDolan - Menu Extras");
        
        this.mainPanel.setId("borderpane");
        
        this.panelScroll = new ScrollPane();
        this.mainPanel.setCenter(this.panelScroll);
        
        this.logo = new ImageView("/imagen/logo.png");
        this.logo.setFitHeight(100);
        this.logo.setFitWidth(100);
        
        mainPanel.setTop(logo);
        BorderPane.setAlignment(logo, Pos.TOP_CENTER);
        
        this.centerPanel = new VBox(10);
        this.centerPanel.setPadding(new Insets(10));
        
        
        
        
        this.panelScroll.setContent(this.centerPanel);
        this.panelScroll.setStyle("-fx-background-color:transparent;");
        
    }
    
}
