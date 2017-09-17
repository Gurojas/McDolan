/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos.Bebida.Batido;

import Productos.Bebida.Bebida;
import Productos.Sabor.Chocolate;
import Productos.Sabor.Fresa;
import Productos.Sabor.Sabor;
import Productos.Sabor.Vanilla;


/**
 *
 * @author Usuario
 */
public class Batido implements Bebida{
    
    private Sabor sabor;
    
    public Batido(String sabor){
        switch(sabor){
            case "Chocolate":
                this.sabor = new Chocolate();
                break;
            case "Vanilla":
                this.sabor = new Vanilla();
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
    public String descripcion() {
        return "El batido de leche (también llamado, según la zona, batido, merengada) "
                + "es una bebida elaborada a base de leche y que lleva vainilla,fresa o chocolate,"
                + "Un factor importante que distingue un batido de la leche mezclada "
                + "es que está preparado generalmente en una batidora y no simplemente revuelto a mano.";
    }

    @Override
    public int costo() {
        return 2500;
    }
    
    
}
