/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.moculo.ventas;

import javax.persistence.EntityManagerFactory;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import url.conexionBD.Conexion;
import url.controlador.ComprasJpaController;
import url.controlador.DetalleCompraJpaController;
import url.controlador.DetalleVentaJpaController;
import url.controlador.ProductoJpaController;
import url.controlador.VentaJpaController;
import url.controladorBD.Venta;
import url.controladorBD.DetalleCompra;
import url.controladorBD.DetalleVenta;
import url.controladorBD.Producto;
import url.modulo.compras.ActualizarExistencia;
import url.modulo.compras.ConfirmarCompra;

/**
 *
 * @author USUARIO
 */
public class DescontarProducto implements ActualizarExistencia{
   private ConfirmarVenta confirmarVenta;
    private EntityManagerFactory emf = Conexion.obtenerConexion();
    ProductoJpaController controlproducto = new ProductoJpaController(emf);
    VentaJpaController controlventas = new VentaJpaController(emf);
    DetalleVentaJpaController controldetalle = new DetalleVentaJpaController(emf);

   public DescontarProducto(ConfirmarVenta confirmarVenta){
       this.confirmarVenta = confirmarVenta;
   }
    @Override
    public void actualizar(JTable tablaproductos) {
        DefaultTableModel mod = (DefaultTableModel) tablaproductos.getModel();
        Producto p1;
        String codigo = "";
        int cantidad = 0;
        for (int i = 0; i < mod.getRowCount(); i++) {
            p1 = new Producto();
            p1.setNombre(mod.getValueAt(i, 0).toString());
            p1.setCantidad((int) (mod.getValueAt(i, 3)));
            p1.setCantidad(p1.getCantidad()*-1);
            System.out.println(p1.getCantidad());
            System.out.println(p1.getNombre() +"="+p1.getCantidad());
            controlproducto.actualizarpornobre(p1);
            llenardetalleventa(p1);
        }
        limpiartabla(tablaproductos);
    }
    private void llenardetalleventa(Producto p1){
        p1 = controlproducto.buscarnombre(p1.getNombre());
        Venta v1 = new Venta();
        v1 = controlventas.findVenta(controlventas.getVentaCount());
        System.out.println(v1.getId());
        DetalleVenta detalleVenta = new DetalleVenta();
        detalleVenta.setProductoid(p1);
        detalleVenta.setVentaid(v1);
        detalleVenta.setDescuento(0);
        controldetalle.create(detalleVenta);
    }
    private void limpiartabla(JTable datos){
        DefaultTableModel mod = (DefaultTableModel) datos.getModel();
        mod.getDataVector().removeAllElements();
        mod.fireTableDataChanged();
    }
    
}
