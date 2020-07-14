/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.usuarios;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import url.conexionBD.Conexion;
import url.controlador.UsuarioJpaController;
import url.controladorBD.Usuario;

/**
 *
 * @author PAOLITA
 */
public class MostrarUsuarios {
    //Obtener tabla de Usuarios (activos y no activos)
     //retornar tabla a form principal<
    EntityManagerFactory emf = Conexion.obtenerConexion();
    UsuarioJpaController controlusuario = new UsuarioJpaController(emf);
    List<Usuario> listausuario;
    
    public void Tablausuarios(JTable usuarios){
        limpiartabla(usuarios);
        DefaultTableModel modelo = (DefaultTableModel) usuarios.getModel();
        listausuario = new ArrayList<>();
        listausuario = controlusuario.findUsuarioEntities();
        for (int i = 0; i < listausuario.size(); i++) {
            System.out.println(listausuario.get(i).getNombre());
            Object [] o = new Object[]{listausuario.get(i).getId(),listausuario.get(i).getNombre(), listausuario.get(i).getDpi()};
            modelo.addRow(o);
        }
        usuarios.setModel(modelo);
        
    }
    private void limpiartabla(JTable datos){
        DefaultTableModel mod = (DefaultTableModel) datos.getModel();
        mod.getDataVector().removeAllElements();
        mod.fireTableDataChanged();
    }
    
    public Usuario retornarUsuario(int idusuario){
        Usuario usu;
        usu = controlusuario.findUsuario(idusuario);
        return  usu;
    }
}
