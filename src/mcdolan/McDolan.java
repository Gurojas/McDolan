/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcdolan;


import GUI.MenuBebidas;

import javafx.application.Application;

import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class McDolan extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        MenuBebidas menuInicial = new MenuBebidas();
        menuInicial.mostrarMenuInicial();
        
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
