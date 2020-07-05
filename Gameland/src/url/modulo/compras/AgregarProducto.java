
package url.modulo.compras;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import url.controladorBD.Producto;

public class AgregarProducto{
    private Producto producto;
    
    public AgregarProducto(){this.producto = new Producto();}
    
    public Producto actualizar(TableModel modeloventa, int selecion){
        producto.setCodigo(modeloventa.getValueAt(selecion, 0).toString());
        producto.setCantidad(Integer.parseInt(modeloventa.getValueAt(selecion, 1).toString()));
        producto.setNombre(modeloventa.getValueAt(selecion, 2).toString());
        producto.setDescripcion(modeloventa.getValueAt(selecion, 3).toString());
        producto.setPrecio(Double.valueOf(modeloventa.getValueAt(selecion, 4).toString()));
        return producto;
    }
}
