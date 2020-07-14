/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.moculo.ventas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import url.modulo.compras.ActualizarExistencia;

/**
 *
 * @author USUARIO
 */
public class ConfirmarVenta{
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
