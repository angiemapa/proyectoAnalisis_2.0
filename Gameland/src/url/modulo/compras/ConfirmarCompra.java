
package url.modulo.compras;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.swing.JTable;
import url.controladorBD.Producto;

/**
 *
 * @author USUARIO
 */
public class ConfirmarCompra {
    private JTable producto;
    private List<ActualizarExistencia> observadores = new ArrayList<>()   ;

    public void setProducto(JTable producto) {
        this.producto = producto;
        notificar();
    }
    public void Agregarobservador(ActualizarExistencia o){
        observadores.add(o);
    
    }
    public void notificar(){
        for (ActualizarExistencia observadore : observadores) {
            observadore.actualizar(producto);
        }
    }
    
}
