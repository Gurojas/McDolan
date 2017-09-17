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
public class Capuccino extends Cafe{
    
    public Capuccino(){
        super();
    }
    
    @Override
    public int costo(){
        return 1600;
    }
    
    @Override
    public String descripcion(){
        return "El capuchino (del italiano cappuccino) es una bebida nacida en Italia, "
                + "preparada con café expreso y leche montada con vapor para crear la espuma, "
                + "que en ocasiones lleva también cacao o canela en polvo. Un capuchino se compone de 125 ml de leche"
                + " y 25 ml de café expreso.";
    }
    
}
