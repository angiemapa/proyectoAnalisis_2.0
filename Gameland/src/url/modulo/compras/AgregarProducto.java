
package url.modulo.compras;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import url.conexionBD.Conexion;
import url.controlador.ComprasJpaController;
import url.controlador.DetalleCompraJpaController;
import url.controlador.ProductoJpaController;
import url.controladorBD.Compras;
import url.controladorBD.Producto;
import url.controladorBD.DetalleCompra;

public class AgregarProducto implements ActualizarExistencia{
    private ConfirmarCompra confirmarCompra;
    private EntityManagerFactory emf = Conexion.obtenerConexion();
    ProductoJpaController controlproducto = new ProductoJpaController(emf);
    ComprasJpaController controlcompras = new ComprasJpaController(emf);
    DetalleCompraJpaController controldetalle = new DetalleCompraJpaController(emf);

   public AgregarProducto(ConfirmarCompra confirmarCompra){
       this.confirmarCompra = confirmarCompra;
   }
    @Override
    public void actualizar(JTable tablaproductos) {
        DefaultTableModel mod = (DefaultTableModel) tablaproductos.getModel();
        Producto p1;
        String codigo = "";
        int cantidad = 0;
        for (int i = 0; i < mod.getRowCount(); i++) {
            p1 = new Producto();
            p1.setCodigo(mod.getValueAt(i, 0).toString());
            p1.setCantidad((int) mod.getValueAt(i, 2));
            System.out.println(p1.getCodigo() +"="+p1.getCantidad());
            controlproducto.actualizarExistencia(p1);
            llenardetallecompra(p1);
        }
        limpiartabla(tablaproductos);
    }
    private void llenardetallecompra(Producto p1){
        p1 = controlproducto.buscarcodigo(p1.getCodigo());
        Compras c1 = new Compras();
        c1 = controlcompras.findCompras(controlcompras.getComprasCount());
        int idcompra = controlcompras.getComprasCount();
        DetalleCompra detalleCompra = new DetalleCompra();
        detalleCompra.setComprasid(c1);
        detalleCompra.setProductoid(p1);
        controldetalle.create(detalleCompra);
    }
    private void limpiartabla(JTable datos){
        DefaultTableModel mod = (DefaultTableModel) datos.getModel();
        mod.getDataVector().removeAllElements();
        mod.fireTableDataChanged();
    }
}
