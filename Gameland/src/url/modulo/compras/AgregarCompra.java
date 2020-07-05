
package url.modulo.compras;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public interface AgregarCompra {
    public DefaultTableModel obtenerModelo(TableModel modeloProducto,DefaultTableModel modeloDetalle,int seleccion,int cantidad);
}
