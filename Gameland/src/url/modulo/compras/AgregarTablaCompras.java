/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.compras;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import url.conexionBD.Conexion;
import url.controlador.DetalleCompraJpaController;
import url.controlador.ProveedorJpaController;
import url.controlador.VentaJpaController;
import url.controladorBD.Proveedor;
import url.controladorBD.DetalleCompra;
import url.controladorBD.Venta;

/**
 *
 * @author USUARIO
 */
public class AgregarTablaCompras implements AgregarCompra{
    EntityManagerFactory emf = Conexion.obtenerConexion();
    ProveedorJpaController control = new ProveedorJpaController(emf);
    DetalleCompraJpaController controldetalle = new DetalleCompraJpaController(emf);
    

    @Override
    public void GuardarCompra(TableModel modeloCompra) {
        for (int i = 0; i < modeloCompra.getRowCount(); i++) {
            DetalleCompra detalle = new DetalleCompra();
            
        }
    }

    @Override
    public Proveedor obtenerproveedor(String nombre) {
        List<Proveedor> lisproveedor = new ArrayList<>();
        Proveedor proveedor = null;
        lisproveedor = control.findProveedorEntities();
        for (int i = 0; i < lisproveedor.size(); i++) {
            if(lisproveedor.get(i).getNombre().equals(nombre)){
                proveedor = (Proveedor) control.findProveedorEntities().get(i);
                return proveedor;
            }
         }
        return  null;
    }
      @Override
    public void Mostrarcompras(JTable detallecompras) {
        VentaJpaController controlventa = new VentaJpaController(emf);
        DefaultTableModel mod = (DefaultTableModel) detallecompras.getModel();
        List<Venta> lis = new ArrayList<>();
        lis = controlventa.findVentaEntities();
        for (int i = 0; i < lis.size(); i++) {
            Object[] o = new Object[]{lis.get(i).getNfactura(), lis.get(i).getFecha(), lis.get(i).getTotal()};
            mod.addRow(o);
        }
        detallecompras.setModel(mod);
    }
   
}
