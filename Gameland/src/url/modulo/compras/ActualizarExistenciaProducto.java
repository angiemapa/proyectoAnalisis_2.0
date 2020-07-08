/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.compras;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import url.controlador.ProductoJpaController;
import url.controladorBD.Producto;

/**
 *
 * @author USUARIO
 */
public class ActualizarExistenciaProducto {
    
    private ProductoJpaController control;
    
     public ActualizarExistenciaProducto(EntityManagerFactory em){
        this.control=new ProductoJpaController(em);
    }
    
    public void actualizarExistencia(Producto producto){
        try {
            //control.Actualizar(producto);
        } catch (Exception ex) {
            Logger.getLogger(ActualizarExistenciaProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
