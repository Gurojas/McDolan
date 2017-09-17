/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import AbstractFactory.FabricaExtra;
import Productos.Extra.Crema;

import Productos.Extra.Sirope;
import Productos.Extra.Trozo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

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
    private HBox panelBottom;
    private Button botonAtras;
    
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
        
        Text textoCremas = new Text("Tipo de cremas");
        textoCremas.setId("textoCategoria");
        this.centerPanel.getChildren().add(textoCremas);
        this.crearCremas();
        
        Text textoSiropes = new Text("Tipo de siropes");
        textoSiropes.setId("textoCategoria");
        this.centerPanel.getChildren().add(textoSiropes);
        this.crearSiropes();
        
        
        Text textoTrozos = new Text("Tipo de trozos");
        textoTrozos.setId("textoCategoria");
        this.centerPanel.getChildren().add(textoTrozos);
        this.crearTrozos();
        
        
        

        this.panelScroll.setContent(this.centerPanel);
        this.panelScroll.setStyle("-fx-background-color:transparent;");
        
        this.panelScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        mainPanel.setCenter(this.panelScroll);
        
        
        this.panelBottom = new HBox();
        this.panelBottom.setPadding(new Insets(10));
        
        this.botonAtras = new Button("Atras");
        this.panelBottom.getChildren().add(this.botonAtras);
        
        this.botonAtras.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                MenuBebidas menuBebidas = new MenuBebidas();
                
            }
        });
        
        this.mainPanel.setBottom(this.panelBottom);
        
        
    }
    
    private void crearCremas(){
        FabricaExtra fabricaExtra = new FabricaExtra();
        Crema cremaBatida = fabricaExtra.crearCrema();
        String url = "/imagen/cremaBatida.png";
        
        PanelExtra panelExtra = new PanelExtra("Crema batida", cremaBatida.costo(), url);
        
        this.centerPanel.getChildren().add(panelExtra);
        
    }
    
    private void crearSiropes(){
        FabricaExtra fabricaExtra = new FabricaExtra();
        Sirope siropeChocolate = fabricaExtra.crearSirope("Chocolate");
        String url = "/imagen/siropeChocolate.jpg";
        
        PanelExtra panelExtra = new PanelExtra("Sirope Chocolate", siropeChocolate.costo(), url);
        this.centerPanel.getChildren().add(panelExtra);
        
        Sirope siropeFresa = fabricaExtra.crearSirope("Fresa");
        url = "/imagen/siropeFresa.jpg";
        panelExtra = new PanelExtra("Sirope Fresa", siropeFresa.costo(), url);
        this.centerPanel.getChildren().add(panelExtra);
        
        Sirope siropeCaremelo = fabricaExtra.crearSirope("Caremelo");
        url = "/imagen/siropeCaramelo.jpg";
        panelExtra = new PanelExtra("Sirope Caremelo", siropeCaremelo.costo(), url);
        this.centerPanel.getChildren().add(panelExtra);
        
    
    }
    
    private void crearTrozos(){
        FabricaExtra fabricaExtra = new FabricaExtra();
        Trozo trozoChocolate = fabricaExtra.crearTrozo("Chocolate");
        String url = "/imagen/trozoChocolate.png";
        PanelExtra panelExtra = new PanelExtra("Trozo de chocolate", trozoChocolate.costo(), url);
        this.centerPanel.getChildren().add(panelExtra);
        
        Trozo trozoGalleta = fabricaExtra.crearTrozo("Galleta");
        url = "/imagen/trozoGalleta.png";
        panelExtra = new PanelExtra("Trozo de Galleta", trozoGalleta.costo(), url);
        this.centerPanel.getChildren().add(panelExtra);
        
        Trozo trozoAvellana = fabricaExtra.crearTrozo("Avellana");
        url = "/imagen/trozoAvellana.png";
        panelExtra = new PanelExtra("Trozo de Avellana", trozoAvellana.costo(), url);
        this.centerPanel.getChildren().add(panelExtra);
        
        Trozo trozoAlmendra = fabricaExtra.crearTrozo("Almendra");
        url = "/imagen/trozoAlmendra.png";
        panelExtra = new PanelExtra("Trozo de Almendra", trozoAlmendra.costo(), url);
        this.centerPanel.getChildren().add(panelExtra);
        
    }
    
}
