/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.estadisticas;

import java.util.Date;
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
    //idcompra, fecha, proveedor, subtotal, total, usuario
    public void filtrarcompra(JTable datos, Date fecha) {
        DefaultTableModel modelo = (DefaultTableModel) datos.getModel();
        limpiartabla(datos);
        liscompras = new ArrayList<>();
        liscompras = controlcompras.findComprasEntities();
        for (int i = 0; i < liscompras.size(); i++) {
            System.out.println(fecha);
            Object[] o = new Object[]{liscompras.get(i).getId(), liscompras.get(i).getFecha(),
                liscompras.get(i).getProveedorid().getNombre(), 0, liscompras.get(i).getTotal(), liscompras.get(i).getLoginid().getUsuario()};
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
