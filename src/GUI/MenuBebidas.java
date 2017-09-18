/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import AbstractFactory.FabricaBebida;
import Productos.Bebida.Batido.Batido;
import Productos.Bebida.Cafe.Cafe;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class MenuBebidas{
    
    private BorderPane mainPanel;
    private ScrollPane panelScroll;
    private VBox centerPanel;
    public static Scene scene;
    private ImageView logo;
    public static Stage stage;
    
    public MenuBebidas(){
        
        stage = new Stage();
        stage.getIcons().add(new ImageView("/imagen/logo.png").getImage());
        stage.setResizable(false);
        
        this.mainPanel = new BorderPane();
        this.mainPanel.setPadding(new Insets(10));
        
        this.scene = new Scene(mainPanel,800,600);
        this.scene.getStylesheets().add("estilos/estilos.css");
        
        this.mainPanel.setId("borderpane");
        
        
        this.stage.setScene(this.scene);
        this.stage.setTitle("McDolan's - Menu Inicial");
        
        
        this.logo = new ImageView("/imagen/logo.png");
        this.logo.setFitHeight(100);
        this.logo.setFitWidth(100);
        
        mainPanel.setTop(logo);
        BorderPane.setAlignment(logo, Pos.TOP_CENTER);
        
        
        this.centerPanel = new VBox(10);
        this.centerPanel.setPadding(new Insets(5));
        
        Text textoCafes = new Text("Tipo de Cafes"); 
        textoCafes.setId("textoCategoria");
        this.centerPanel.getChildren().add(textoCafes);
        this.crearCafes();
        
        Text textoBatidos = new Text("Tipo de batidos");
        textoBatidos.setId("textoCategoria");
        this.centerPanel.getChildren().add(textoBatidos);
        this.crearBatidos();
        
       
        this.panelScroll = new ScrollPane();
        
        
        this.panelScroll.setContent(this.centerPanel);
        this.panelScroll.setStyle("-fx-background-color:transparent;");
        
        
        this.panelScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        mainPanel.setCenter(this.panelScroll);

    }
    
    public static void cambiarEscena(){
        MenuBebidas.stage.setScene(scene);
        stage.setTitle("McDolan's - Menu Inicial");
    }
    
    public void mostrarMenuInicial(){
        this.stage.show();
    }
    
    private void crearBatidos(){
        FabricaBebida fabricaBebida = new FabricaBebida();
        Batido batidoVainilla = fabricaBebida.crearBatido("Vainilla");
        String url = "/imagen/batidoVainilla.png";
        PanelBebida panel = new PanelBebida(batidoVainilla.nombre(), batidoVainilla.descripcion(),batidoVainilla.costo() , url);
        
        this.centerPanel.getChildren().add(panel);
        
        Batido batidoChocolate = fabricaBebida.crearBatido("Chocolate");
        url = "/imagen/batidoChocolate.png";
        panel = new PanelBebida(batidoChocolate.nombre(), batidoChocolate.descripcion(),batidoChocolate.costo() ,url);
        
        this.centerPanel.getChildren().add(panel);
        Batido batidoFresa = fabricaBebida.crearBatido("Fresa");
        url = "/imagen/batidoFresa.png";
        panel = new PanelBebida(batidoFresa.nombre(), batidoFresa.descripcion(),batidoFresa.costo() , url);
        
        this.centerPanel.getChildren().add(panel);
        
    }
    
    private void crearCafes(){
        FabricaBebida fabricaBebida = new FabricaBebida();
        Cafe latte = fabricaBebida.crearCafe("Latte");
        String url = "/imagen/latte.png";
        PanelBebida panel = new PanelBebida(latte.nombre(), latte.descripcion(),latte.costo(),url);
        
        this.centerPanel.getChildren().add(panel);
        
        url = "/imagen/espresso.png";
        Cafe espresso = fabricaBebida.crearCafe("Espresso");
        panel = new PanelBebida(espresso.nombre(), espresso.descripcion(),espresso.costo(),url);
        
        this.centerPanel.getChildren().add(panel);
        
        url = "/imagen/mocha.png";
        Cafe mocha = fabricaBebida.crearCafe("Mocha");
        panel = new PanelBebida(mocha.nombre(), mocha.descripcion(),mocha.costo(),url);
        
        this.centerPanel.getChildren().add(panel);
        
        url = "/imagen/capuccino.png";
        Cafe capuccino = fabricaBebida.crearCafe("Capuccino");
        panel = new PanelBebida(capuccino.nombre(), capuccino.descripcion(),capuccino.costo(),url);
        
        this.centerPanel.getChildren().add(panel);
        
        url = "/imagen/machiatto.png";
        Cafe machiatto = fabricaBebida.crearCafe("Machiatto");
        panel = new PanelBebida(machiatto.nombre(), machiatto.descripcion(),machiatto.costo(),url);
        
        this.centerPanel.getChildren().add(panel);
        
    }
    
    public Scene getScene(){
        return this.scene;
    }
    
}
