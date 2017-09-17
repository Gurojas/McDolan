/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Productos.Bebida.Bebida;
import Productos.Extra.Extra;


/**
 *
 * @author Usuario
 */
public interface FabricaAbstracta {
    
    public Bebida crearCafe(String bebida);
    
    public Bebida crearBatido(String sabor);
    
    public Extra crearSirope(String sabor);
    
    public Extra crearCrema();
    
    public Extra crearTrozo(String tipo);
}
