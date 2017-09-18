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
public class Mocha extends Cafe{
    
    public Mocha(){
        super();
        this.precio = 2200;
        this.nombre = "Cafe Mocha";
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
        return "Un café moca es una variante del café con leche. Como éste, suele "
                + "llevar un tercio de expreso y dos tercios de leche vaporizada,"
                + " pero se añade una parte de chocolate, normalmente en forma de jarabe de chocolate, "
                + "si bien algunas máquinas usan chocolate en polvo instantáneo. Los mocas contienen chocolate"
                + " negro o con leche.";
    }
    
}
