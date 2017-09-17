/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Productos.Bebida.Bebida;
import Productos.Bebida.Cafe.Cafe;
import Productos.Extra.Crema;
import Productos.Extra.Sirope;
import Productos.Extra.Trozo;


/**
 *
 * @author Usuario
 */
public interface FabricaAbstracta {
    
    public Cafe crearCafe(String bebida);
    
    public Bebida crearBatido(String sabor);
    
    public Sirope crearSirope(String sabor);
    
    public Crema crearCrema();
    
    public Trozo crearTrozo(String tipo);
}
