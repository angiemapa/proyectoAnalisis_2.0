
package url.modulo.compras;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import url.controladorBD.Proveedor;

public interface AgregarCompra {
    public void GuardarCompra(TableModel modeloCompra);
    public Proveedor obtenerproveedor(String nombre);
}
