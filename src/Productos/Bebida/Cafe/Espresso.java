/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos.Bebida.Cafe;

/**
 *
 * @author Usuario
 */
public class Espresso extends Cafe{
    
    public Espresso(){
        super();
    }
    
    @Override
    public int costo(){
        return 1800;
    }
    
    @Override
    public String descripcion(){
        return "El café expreso (también llamado café exprés, express, espresso "
                + "o solo) es una forma de preparación de café originada en Italia"
                + " Debe su término a la obtención de esta bebida a través de una cafetera"
                + " expreso. Se caracteriza por su rápida preparación y por un sabor y textura más concentrados.";
    }
    
}
