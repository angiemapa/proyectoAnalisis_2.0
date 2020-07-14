/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.estadisticas;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import url.conexionBD.Conexion;
import url.controlador.ComprasJpaController;
import url.controladorBD.Compras;

/**
 *
 * @author PAOLITA
 */
public class MostrarEstadisticas {
    //Consulta estadisticas segun filtros (compras, mes, anio)
    //Crear tabla estadísticas (id, fecha, proveedor/cliente (segun filtro), total, usuario
    //devolver tabla con filtro
    private EntityManagerFactory emf = Conexion.obtenerConexion();
    ComprasJpaController controlcompras = new ComprasJpaController(emf);
    List<Compras> liscompras;
    private JTable tablacompras;
    public void settabla(JTable tabla){
        this.tablacompras = tabla;
    }
    
    public void filtrarcompra(){
        DefaultTableModel modelo = (DefaultTableModel) tablacompras.getModel();
        limpiartabla();
        liscompras = new ArrayList<>();
        liscompras = controlcompras.findComprasEntities();
        for (int i = 0; i < liscompras.size(); i++) {
            Object [] o = new Object[]{liscompras.get(i).getId(), liscompras.get(i).getFecha(), liscompras.get(i).getProveedorid().getNombre(), liscompras.get(i).getTotal()};
            modelo.addRow(o);
        }
        tablacompras.setModel(modelo);
    }
    public void filtrarpormes(Date mes) {
        DefaultTableModel modelo = (DefaultTableModel) tablacompras.getModel();
        limpiartabla();
        liscompras = new ArrayList<>();
        liscompras = controlcompras.findComprasEntities();
        for (int i = 0; i < liscompras.size(); i++) {
            if (liscompras.get(i).getFecha().getMonth() == mes.getMonth()) {
                Object[] o = new Object[]{liscompras.get(i).getId(), liscompras.get(i).getFecha(), liscompras.get(i).getProveedorid().getNombre(), liscompras.get(i).getTotal()};
                modelo.addRow(o);
            }
        }
        tablacompras.setModel(modelo);
    }
    public JTable tablaconfiltro(){
        return  tablacompras;
    }
    private void limpiartabla(){
        DefaultTableModel mod = (DefaultTableModel) tablacompras.getModel();
        mod.getDataVector().removeAllElements();
        mod.fireTableDataChanged();
    }
}
