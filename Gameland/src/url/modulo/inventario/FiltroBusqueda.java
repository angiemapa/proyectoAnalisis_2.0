/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.inventario;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import url.conexionBD.Conexion;
import url.controlador.ProductoJpaController;
import url.controladorBD.Producto;

/**
 *
 * @author USUARIO
 */
public class FiltroBusqueda {
    private EntityManagerFactory emf = Conexion.obtenerConexion();
    ProductoJpaController controlproductos = new ProductoJpaController(emf);
    List<Producto> lisproductos;
    public void inventarioproductos(JTable datos){
        limpiartabla(datos);
        DefaultTableModel modelo = (DefaultTableModel) datos.getModel();
        lisproductos = new ArrayList<>();
        lisproductos = controlproductos.findProductoEntities();
        for (int  i= 0; i < lisproductos.size(); i++) {
            Object [] o = new Object[]{lisproductos.get(i).getCodigo(), lisproductos.get(i).getNombre(),lisproductos.get(i).getDescripcion(), lisproductos.get(i).getCantidad()};
            modelo.addRow(o);
        }
        datos.setModel(modelo);
    }
    
    private void limpiartabla(JTable datos){
        DefaultTableModel mod = (DefaultTableModel) datos.getModel();
        mod.getDataVector().removeAllElements();
        mod.fireTableDataChanged();
    }
    
}
