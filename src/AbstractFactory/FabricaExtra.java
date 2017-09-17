/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Productos.Bebida.Bebida;
import Productos.Extra.CremaBatida;
import Productos.Extra.Extra;
import Productos.Extra.Sirope;
import Productos.Extra.TrozoAlmendra;
import Productos.Extra.TrozoAvellana;
import Productos.Extra.TrozoChocolate;
import Productos.Extra.TrozoGalleta;

/**
 *
 * @author Usuario
 */
public class FabricaExtra implements FabricaAbstracta{

    @Override
    public Bebida crearCafe(String bebida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Bebida crearBatido(String sabor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Extra crearSirope(String sabor) {
        return new Sirope(sabor);
    }

    @Override
    public Extra crearCrema() {
        return new CremaBatida();
    }

    @Override
    public Extra crearTrozo(String tipo) {
        switch(tipo){
            case "Chocolate":
                return new TrozoChocolate();
            case "Galleta":
                return new TrozoGalleta();
            case "Avellana":
                return new TrozoAvellana();
            default:
                return new TrozoAlmendra();
        }
    }

    
    
    
    
}
