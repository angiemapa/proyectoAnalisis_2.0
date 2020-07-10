
package url.moculo.ventas;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public interface AgregarVenta {
    public DefaultTableModel obtenerModelo(TableModel modeloProducto,DefaultTableModel modeloDetalle,int seleccion,int cantidad);
    
}
