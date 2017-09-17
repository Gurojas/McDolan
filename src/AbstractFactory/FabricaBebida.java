/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Productos.Bebida.Batido.Batido;
import Productos.Bebida.Cafe.Cafe;
import Productos.Bebida.Cafe.Capuccino;
import Productos.Bebida.Cafe.Espresso;
import Productos.Bebida.Cafe.Latte;
import Productos.Bebida.Cafe.Machiatto;
import Productos.Bebida.Cafe.Mocha;
import Productos.Extra.Extra;

/**
 *
 * @author Usuario
 */
public class FabricaBebida implements FabricaAbstracta{

    @Override
    public Cafe crearCafe(String bebida) {
        switch (bebida) {
            case "Espresso":
                return new Espresso();
            case "Mocha":
                return new Mocha();
            case "Capuccino":
                return new Capuccino();
            case "Machiatto":
                return new Machiatto();
            case "Latte":
                return new Latte();
            default:
                return new Capuccino();
        }
    }

    @Override
    public Batido crearBatido(String sabor) {
        return new Batido(sabor);
    }

    @Override
    public Extra crearSirope() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Extra crearCrema() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Extra crearTrozo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    

    



    
    
    
    
    
}
