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
    }
     
    @Override
    public int costo(){
        return 1800;
    }
    
    @Override
    public String descripcion(){
        return "Es un café cortado típico de Italia, consistente en un expreso "
                + "con una pequeña cantidad de leche caliente y espumada. "
                + "En España se suele denominar simplemente manchado.";
    }
    
}
