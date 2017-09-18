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
public class Latte extends Cafe{
    

    public Latte(){
        super();
        this.precio = 1200;
        this.nombre = "Cafe Latte";
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
        return "El latte macchiato es una bebida preparada con leche y café "
                + "expreso. Latte Macchiato (la(ː)te maʔˈkja(ː)to) significa en "
                + "italiano simplemente ‘leche manchada’. El nombre hace referencia "
                + "al modo de preparación, donde la leche queda «manchada» con el "
                + "café añadido. Se diferencia de modo significativo del café con leche "
                + "porque sólo se utiliza ½ tiro de expreso (o menos).";
        
    }
    
}
