/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos.Extra;

import Productos.Sabor.Caremelo;
import Productos.Sabor.Chocolate;
import Productos.Sabor.Fresa;
import Productos.Sabor.Sabor;

/**
 *
 * @author Usuario
 */
public class Sirope implements Extra{
    
    private Sabor sabor;
    
    public Sirope(String sabor){
        switch(sabor){
            case "Chocolate":
                this.sabor = new Chocolate();
                break;
            case "Caremelo":
                this.sabor = new Caremelo();
                break;
            case "Fresa":
                this.sabor = new Fresa();
                break;
        }
    }
    
    public Sabor getSabor(){
        return this.sabor;
    }

    @Override
    public int costo() {
        return 300;
    }
    
}
