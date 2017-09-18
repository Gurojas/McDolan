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
public class Machiatto extends Cafe{
    
    public Machiatto(){
        super();
        this.precio = 1800;
        this.nombre = "Cafe Machiatto";
    }
    
    @Override
    public String nombre(){
        return this.nombre;
    }
     
    @Override
    public int costo(){
        return this.precio;
    }
    
    @Override
    public String descripcion(){
        return "Es un café cortado típico de Italia, consistente en un expreso "
                + "con una pequeña cantidad de leche caliente y espumada. "
                + "En España se suele denominar simplemente manchado.";
    }
    
}
